B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8
@EndOfDesignText@
'Class module
Sub Class_Globals

#Region Declarations	
	Private MenuItems, MenuItemNewX, MenuItemNewY As List
	Private Animator, AnimMenuItemRotate, AnimMenuItemMove As AnimationPlus
	Private AnimSet As AnimationSet
	Private IsAnimating As Boolean = False
	Private staticMenuButton, animatedMenuButton As ImageView
	Private mEventName As String
	Private mActivity As Activity
	Private mModule As Object
	Private CenterX, CenterY As Int
	Private menuOpen As Boolean = False
	Private CurrentPosition As Int = 1
	Private AnimationEndCount As Int = 0
	Private MenuItemAnimationDelay As Int = 80
	
	'Default Options
	Private StaticMenuButtonWidth As Int = 52dip
	Private StaticMenuButtonHeight As Int = 52dip
	Private AnimatedMenuButtonWidth As Int = 20dip
	Private AnimatedMenuButtonHeight As Int = 20dip
	Private MenuItemWidth As Int = 40dip
	Private MenuItemHeight As Int = 40dip
	Private StartDegrees As Int = -90
	Private DegreesSpan As Int = 90
	Private ItemRadius As Int = 120dip
#End Region

End Sub

#Region Initialize
'Initializes the object.
'
'Parameters:
'Activity - The activity to add the OrbitalMenu to. Use 'Activity' to pass the current activity.
'Module - Use 'Me'
'EventName - The EventName to be use for callbacks. 
'            _AnimationEnd(Open as Boolean) - this event triggers once the menu has finished expanding or collapsing.
'                                             Open - will return whether the menu is open or not.
'            _Click(Position as Int)
'            _LongClick(Position as Int)
'            Position - returns the Item Position that triggered the event. First Item = 1.
'StaticButtonImage - A static background for the menu button. Use NULL for no image.
'AnimatedButtonImage - A bitmap that will show in front of the StaticBackgroundImage and will rotate 90 degrees when pressed. Use NULL for no image.
'x, y - The coordinates for where the button will appear.
Public Sub Initialize(Activity As Panel, Module As Object, EventName As String, AnimatedButtonImage As Bitmap, StaticButtonImage As Bitmap, x As Int, y As Int)

	CenterX = x
	CenterY = y
	mEventName = EventName
	mActivity = Activity
	mModule = Module
	
	MenuItems.Initialize
	
	If StaticButtonImage.IsInitialized Then
		staticMenuButton.Initialize("menuButton")
		staticMenuButton.Bitmap = StaticButtonImage
		staticMenuButton.Gravity = Gravity.FILL	
		
		Activity.AddView(staticMenuButton, x - (StaticMenuButtonWidth / 2), y - (StaticMenuButtonHeight / 2), StaticMenuButtonWidth, StaticMenuButtonHeight)
		staticMenuButton.BringToFront
	End If
	
	If AnimatedButtonImage.IsInitialized Then
		animatedMenuButton.Initialize("menuButton")
		animatedMenuButton.Bitmap = AnimatedButtonImage
		animatedMenuButton.Gravity = Gravity.FILL
		
		Activity.AddView(animatedMenuButton, x - (AnimatedMenuButtonWidth / 2), y - (AnimatedMenuButtonHeight / 2), AnimatedMenuButtonWidth, AnimatedMenuButtonHeight)
		animatedMenuButton.BringToFront
		
	End If
	staticMenuButton.BringToFront
	animatedMenuButton.BringToFront
End Sub
#End Region

#Region AddItem
'Adds an item to the menu.
'ItemImage - the image shown as the MenuItem
Sub AddItem(ItemImage As Bitmap)
	
	Dim img As ImageView
	img.Initialize("MenuItem")
	img.Bitmap = ItemImage
	img.Tag = CurrentPosition
	img.Gravity = Gravity.FILL
	img.Visible = False
	MenuItems.Add(img)
		
	mActivity.AddView(img, CenterX - (MenuItemWidth / 2), CenterY - (MenuItemHeight / 2), MenuItemWidth, MenuItemHeight)
		
	CurrentPosition = CurrentPosition + 1
	img.SendToBack

End Sub
#End Region

#Region Toggle
'Simulates a Click of the menu Button
Sub Toggle
	menuButton_Click
End Sub
#End Region

#Region IsOpen
Sub IsOpen As Boolean
	Return menuOpen
End Sub
#End Region

#Region MenuButton_Click
Private Sub menuButton_Click
	If Not(IsAnimating) Then
		MenuItemNewX.Initialize
		MenuItemNewY.Initialize
		If menuOpen Then
			If animatedMenuButton.IsInitialized Then Animator.InitializeRotateCenter("menuButtonRotate", 45, 0, animatedMenuButton)
			For i = MenuItems.Size - 1 To 0 Step -1
				AnimSet = GetMenuItemAnimation(MenuItems.Get(i), Not(menuOpen))
				AnimSet.Start(MenuItems.Get(i))
				Dim a As View
				a = MenuItems.Get(i)
				a.BringToFront
			Next
		Else
			If animatedMenuButton.IsInitialized Then Animator.InitializeRotateCenter("menuButtonUnRotate", 0, 45, animatedMenuButton)
			For i = 0 To MenuItems.Size - 1
				AnimSet = GetMenuItemAnimation(MenuItems.Get(i), Not(menuOpen))
				AnimSet.Start(MenuItems.Get(i))
			Next
		End If
		

		IsAnimating = True
		menuOpen = Not(menuOpen)
		AnimationEndCount = 0
		If animatedMenuButton.IsInitialized Then
			Animator.Duration = 400
			Animator.RepeatCount = 0
			Animator.PersistAfter = True
			Animator.Start(animatedMenuButton)
		End If
	End If

End Sub
#End Region

#Region AnimationEnd
Private Sub AnimMenuItemMove_AnimationEnd
	'counts the Animation_End events for the menuitems and updates the MenuItems LayoutParams. This makes the MenuItems Click events work.
	Dim img As ImageView
	Dim ItemPosition As Int
	If menuOpen = False Then
		ItemPosition = (MenuItems.Size - 1) - AnimationEndCount
	Else
		ItemPosition = AnimationEndCount
	End If
	
	img = MenuItems.Get(ItemPosition)

	If Not(menuOpen) Then img.Visible = False
	img.Invalidate
	AnimMenuItemMove.Stop(img)
	UpdateMenuItemPosition(MenuItems.Get(ItemPosition), ItemPosition)
	If AnimationEndCount = MenuItems.Size - 1 Then
		IsAnimating = False
		If SubExists(mModule, mEventName & "_AnimationEnd") Then CallSubDelayed2(mModule, mEventName & "_AnimationEnd", menuOpen)
	Else
		AnimationEndCount = AnimationEndCount + 1
	End If
	
End Sub

Private Sub AnimItemSelected_AnimationEnd
	Dim img As ImageView
	
	For i = 0 To MenuItems.Size - 1
		img = MenuItems.Get(i)
		img.Visible = False
		img.Invalidate
		Animator.Stop(img)
		img.Left = CenterX - (img.Width / 2)
		img.Top = CenterY - (img.Height / 2)
	Next
	menuOpen = False
End Sub
#End Region

#Region MenuItem_Click
Private Sub MenuItem_Click
	If SubExists(mModule, mEventName & "_Click") Then
		Dim Item As ImageView
		Item = Sender
		GetSelectedAnimation(Item)
		CallSubDelayed2(mModule, mEventName & "_Click", Item.Tag)
	End If
End Sub
#End Region

#Region MenuItem_LongClick
Private Sub MenuItem_LongClick
	If SubExists(mModule, mEventName & "_LongClick") Then
		Dim Item As ImageView
		Item = Sender
		CallSubDelayed2(mModule, mEventName & "_LongClick", Item.Tag)
	End If
End Sub
#End Region

#Region SetAnimatedButtonDimensions
'Use to override the dimensions of the AnimatedButtonImage
'Defaults are 20dip x 20dip
Sub SetAnimatedButtonDimensions(width As Int, height As Int)
	animatedMenuButton.width = width
	animatedMenuButton.height = height
	animatedMenuButton.Left = CenterX - (width / 2)
	animatedMenuButton.Top = CenterY - (height / 2)
End Sub
#End Region

#Region SetStaticButtonDimensions
'Use to override the dimensions of the StaticButtonImage
'Defaults are 20dip x 20dip
Sub SetStaticButtonDimensions(width As Int, height As Int)
	staticMenuButton.width = width
	staticMenuButton.height = height
	staticMenuButton.Left = CenterX - (width / 2)
	staticMenuButton.Top = CenterY - (height / 2)
End Sub
#End Region

#Region SetMenuItemDimensions
'NOTE: Must be called before Adding and items to the menu.
'Use to override the dimensions of the menu items.
'Defaults are 40dip x 40dip
Sub SetMenuItemDimensions(width As Int, height As Int)
	MenuItemWidth = width
	MenuItemHeight = height
End Sub
#End Region

#Region SetMenuItemRadius
'Use to set the Menu item radius (the distance the items pop out from center)
'Default is 120dip
Sub SetMenuItemRadius(value As Int)
	ItemRadius = value
End Sub
#End Region

#Region SetStartDegrees
'Sets the angle the MenuItems Orbit will start at.
'Default is 0 (straight up.)
Sub SetStartDegrees(value As Int)
	StartDegrees = value
End Sub
#End Region

#Region SetDegreeSpan
'Sets the amount of degrees the MenuItems Orbit will span from the starting point.
'Default is 90
Sub SetDegreeSpan(value As Int)
	DegreesSpan = value
End Sub
#End Region

#Region GetMenuItemAnimation
Private Sub GetMenuItemAnimation(MenuItem As ImageView, Open As Boolean) As AnimationSet
	Dim SubAnimSet As AnimationSet
	Dim ToX, ToY, ItemPosition As Int
	Dim DegreesPerItem, DegreeRadians As Float
	
	SubAnimSet.Initialize(False)
		
	ItemPosition = MenuItem.Tag
	
	If DegreesSpan = 360 Then DegreesSpan = 360 - (360 / MenuItems.Size)
	
	If MenuItems.Size > 1 Then
		DegreesPerItem = DegreesSpan / (MenuItems.Size -1)
	Else
		DegreesPerItem = DegreesSpan
	End If
	DegreeRadians = (StartDegrees + (DegreesPerItem * (ItemPosition - 1))) * cPI/180
	
	ToY = (ItemRadius * (Cos(DegreeRadians)))
	ToX = (ItemRadius * (Sin(DegreeRadians)))
	If Open Then
		MenuItem.Visible = True
		AnimMenuItemRotate.InitializeRotateCenter("", 0, 360, MenuItem)
		AnimMenuItemMove.InitializeTranslate("AnimMenuItemMove", 0, 0, ToX, -ToY)
		SubAnimSet.StartOffset = MenuItemAnimationDelay * ItemPosition
		AnimMenuItemMove.SetInterpolator(AnimMenuItemMove.INTERPOLATOR_OVERSHOOT)
		MenuItemNewX.Add(MenuItem.Left + ToX)
		MenuItemNewY.Add(MenuItem.Top - ToY)
	Else
		AnimMenuItemRotate.InitializeRotateCenter("", 360, 0, MenuItem)
		AnimMenuItemMove.InitializeTranslate("AnimMenuItemMove", 0, 0, -ToX, ToY)
		SubAnimSet.StartOffset = MenuItemAnimationDelay * ((MenuItems.Size - 1) - ItemPosition)
		AnimMenuItemMove.SetInterpolator(AnimMenuItemMove.INTERPOLATOR_ANTICIPATE)
		MenuItemNewX.Add(MenuItem.Left - ToX)
		MenuItemNewY.Add(MenuItem.Top + ToY)
	End If
	

	AnimMenuItemRotate.Duration = 400
	AnimMenuItemRotate.RepeatCount = 0
	AnimMenuItemRotate.PersistAfter = True
	AnimMenuItemMove.Duration = 450
	AnimMenuItemMove.RepeatCount = 0
	AnimMenuItemMove.PersistAfter = True
	
	SubAnimSet.AddAnimation(AnimMenuItemRotate)
	SubAnimSet.AddAnimation(AnimMenuItemMove)

	SubAnimSet.PersistAfter = True
	
	Return SubAnimSet
End Sub
#End Region

#Region GetSelectedAnimation
Private Sub GetSelectedAnimation(MenuItem As ImageView) 'As AnimationSet
	Dim ItemPosition As Int
	Dim item As ImageView
	Dim AnimRotate, AnimFade, AnimScale As AnimationPlus
	Dim AnimSet As AnimationSet
	
	AnimSet.Initialize(False)
	ItemPosition = MenuItem.Tag
	
	For i = 0 To MenuItems.Size - 1
		item = MenuItems.Get(i)
		If item.Tag = ItemPosition Then
			'selected item
			AnimRotate.InitializeRotateCenter("", 0, 360, item)
			AnimScale.InitializeScaleCenter("", 1, 1, 2, 2, item)
		Else
			'non-selected items
			AnimRotate.InitializeRotateCenter("", 360, 0, item)
			AnimScale.InitializeScaleCenter("", 1, 1, 0, 0, item)
		End If
		
		If i = MenuItems.Size - 1 Then
			AnimFade.InitializeAlpha("AnimItemSelected", 1, 0)
		Else
			AnimFade.InitializeAlpha("", 1, 0)
		End If
		
		AnimRotate.Duration = 200
		AnimRotate.RepeatCount = 3
		AnimFade.Duration = 400
		AnimFade.RepeatCount = 0
		AnimScale.Duration = 400
		AnimScale.RepeatCount = 0
		
		AnimSet.Initialize(False)
		AnimSet.AddAnimation(AnimRotate)
		AnimSet.AddAnimation(AnimFade)
		AnimSet.AddAnimation(AnimScale)
		AnimSet.SetInterpolator(AnimSet.INTERPOLATOR_DECELERATE)
		AnimSet.PersistAfter = True
		AnimSet.Start(item)
	Next
	
	'reset menubutton
	If animatedMenuButton.IsInitialized Then
		Animator.InitializeRotateCenter("menuButtonRotate", 45, 0, animatedMenuButton)
		Animator.Duration = 400
		Animator.RepeatCount = 0
		Animator.PersistAfter = True
		Animator.Start(animatedMenuButton)
	End If
End Sub
#End Region

#Region UpdateMenuItemPosition
Private Sub UpdateMenuItemPosition(Item As ImageView, Position As Int)
	Item.Left = MenuItemNewX.Get(Position)
	Item.Top = MenuItemNewY.Get(Position)
End Sub
#End Region