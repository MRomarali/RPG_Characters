# RPG_Characters

<div id="top"></div>

<div align="center">
  <img src="" alt="" height="250">
  <h3 align="center">Assignment 5</h3>
</div>

# Table of Contents

1. [Instructions](#instructions)
2. [Appendix A](#appendix-a)
3. [Resources](#resources)
4. [Install](#install)
5. [Usage](#usage)
6. [Maintainers](#maintainers)
7. [Contributing](#contributing)
8. [Conventions](#conventions)
9. [Contact](#contact)

# Instructions

## Assignment 5

### Build a console application in Java

### RPG Characters

<p>
  Build a console application in Java. Follow the guidelines given below, feel free to expand on the functionality. It must 
meet the minimum requirements prescribed.
</p>
## 1. Set up the development environment
  <li>
    <p>Make sure you have installed at least the following tools:</p>
    <ul>
        <li>IntelliJ with JDK 17</li>
    </ul>
  </li>
  ## 2.  Optional: Class interaction diagrams
  
<p>You can draw out the planning of the various classes and their interactions to help visualize the application and its 
functionality.
</p>
## 3.  Use plain Java to create a console application with the following minimum          requirements (See Appendix A-C for details):
<p>a) Various character classes having attributes which increase at different rates as the character gains levels.</p>
<p>b) Equipment, such as armor and weapons, that characters can equip. The equipped items will alter the power of 
the character, causing it to deal more damage and be able to survive longer. Certain characters can equip 
certain item types.
</p>
<p>Custom exceptions. There are two custom exceptions you are required to write, as detailed in Appendix B.</p>
<p>d) Full test coverage of the functionality. Some testing data is provided, it can be used to complete the assignment 
in a test-driven development manner.</p>

## 4. Submit
<p>a) Create a GitLab repository containing all your code. </p>
<p>b) This repository should contain a well formatted REAME and appropriate commit messages and branches.
</p>
<p>c) You can include the class diagram in this repository if you have made one. </p>
<p>d) The repository must be either public, or I am added as a Maintainer (ask for lecturers Gitlab handle)
</p>
<p>e) Submit only the link to your GitLab repository (not the “clone with SSH”).</p>
      
<p align="right">(<a href="#top">back to top</a>)</p>

# Appendix A: Character classes and attributes 
## 1. Introduction and overview
<p>In the game there are currently four classes that a character/hero can be:</p>
    <ul>
      <li>Mage</li>
      <li>Ranger</li>
      <li> Rogue</li>
      <li> Warrior</li>
    </ul>
    <p>Characters in the game have several types of attributes, which represent       different aspects of the character.
    </p>
    
    <p>These attributes are what determine the characters power, as the character     levels up their attributes increase. Items 
    they equip also can increase these attributes (this is detailed in Appendix B)     Certain character classes are more durable 
    against certain types of damage.
    </p>
## 2. Attributes
<p>The attribute system found in this assignment is based on the traditional Three-Stat System leaning towards a Diablo 3
implementation. Looking at primary attributes:</p>
<ul>
  <li> Strength – determines the physical strength of the character.
o Each point of strength increases a Warriors damage by 1%.</li>
  <li> Dexterity – determines the characters ability to attack with speed and nimbleness.
o Each point of dexterity increases a Rangers and Rogues damage by 1%.</li>
  <li>ntelligence – determines the characters affinity with magic.
o Each point of intelligence increases a Mages damage by 1%</li>
</ul>

<p> Finally, a character can deal Damage. The amount of damage depends on the weapon equipped, the character class, and 
the amount of primary attribute the character has. This calculation is detailed in Appendix B when items are discussed. </p>

<p> It is recommended to make custom type (class) called PrimaryAttribute to encapsulate the attributes. </p>

## 3. Character classes and levelling
<p>It is recommended to have a base abstract Character/Hero class that can be used to encapsulate the functionality. 
Functionality that is different between character classes can be defined as an abstract method in the base class, to be 
implemented in the inheriting class. This is to limit repeated functionality – DRY.
</p>

<p>All characters have the following properties:
</p>
<ul>
  <Li>Name</li>
  <Li>Name</li>
  <Li>Base Primary attributes</li>
  <Li>Total Primary attributes</li>
</ul>

<div>
  NOTE: There are more properties a character has, those are relating to items and equipment. Those properties will be 
detailed in Appendix B.
</div>
<p>When a character is created, they are provided a name. Every character begins at level 1. There should be a way to 
increase the level of a character.</p>

<p>The separation of base and total primary attributes is for a very simple reason that will help avoid a great deal of 
trouble. It is done this way so the characters primary attributes from itself and its levels are separate from the bonus 
primary attribute from equipment. This is detailed more in Appendix B, but all that needs to be knows now is that it 
simplifies switching equipment.</p>

## 3.1) Mage attribute gain
<p>
A Mage begins at level 1 with:
Strength Dexterity Intelligence
1 1 8
Every time a Mage levels up, they gain:
Strength Dexterity Intelligence
1 1 5
</p>

<div>
RECALL: Mages deal increased damage for every point of Intelligence. 
</div>
## 3.2) Ranger attribute gain

<p>
A Ranger begins at level 1 with:
Strength Dexterity Intelligence
1 7 1
Every time a Ranger levels up, they gain:
Strength Dexterity Intelligence
1 5 1
</p>

<div>
RECALL: Rangers deal increased damage for every point of Dexterity.
</div>

## 3.3) Rogue attribute gain

<p>
A Rogue begins at level 1 with:
Strength Dexterity Intelligence
2 6 1
Every time a Rogue levels up, they gain:
Strength Dexterity Intelligence
1 4 1
</p>

<div>
RECALL: Rogues deal increased damage for every point of Dexterity
</div>

## 3.4) Warrior attribute gain

<p>
A Warrior begins at level 1 with:
Strength Dexterity Intelligence
5 2 1
Every time a Warrior levels up, they gain:
Strength Dexterity Intelligence
3 2 1
</p>

<div>
RECALL: Warriors deal increased damage for every point of Strength.
</div>

<p align="right">(<a href="#top">back to top</a>)</p>

# Appendix B: Items and equipment 

## 1. Introduction and overview
<p>The game has items which exist. These items can be equipped by characters to increase their power, this is called 
equipping an item. The currently equipped items are called the characters equipment.</p>
<p>There are two types of items which exist:</p>
<ul>
  <li>Weapons</li>
  <li>Armor</li>
</ul>

<p>Weapons determine the damage a character can deal, which is then enhanced by the characters attributes. Armor adds 
to the attributes of a character</p>
<p>Certain characters can only equip specific types of weapons and armor, custom exceptions are used to give proper 
feedback on this.</p>
<p>It is recommended to have a base abstract Item with Weapon and Armor can inherit. These simplifies equipment 
management greatly.
</p>
<p>All items have:
</p>

<ul>
  <li>Name</li>
  <li>Required level to equip the item.
  </li>
  <li>Slot in which the item is equipped.
  </li>
</ul>
## 2. Weapons
<p>There are several types of weapons which exist:</p>
<ul>
  <li>Axes</li>
  <li>Bows</li>
  <li>Daggers</li>
  <li>Hammers</li>
  <li>Staffs</li>
  <li>Swords</li>
  <li>Wands</li>
</ul>
<p>It is recommended to store these types as a property in the Weapon. An enumerator could be useful here to compose 
your weapon with its type.</p>
<p>Weapons have damage, and how many attacks per second can be performed with the weapon. The weapons damage 
per second (DPS) is calculated by multiplying these together.</p>
<ul>
  <li>DPS = Damage * Attack speed</li>
</ul>
<div> NOTE: When calculating the DPS of a character, the weapon DPS is used, not the damage. </div>

<p>As mentioned before, certain character classes can equip certain weapon types. This is shown below:.</p>
<ul>
  <li>Mages – Staff, Wand
  </li>
  <li>Rangers – Bow</li>
  <li>Rogues – Dagger, Sword
  </li>
  <li>Warriors – Axe, Hammer, Sword</li>
</ul>

<p> If a character tries to equip a weapon they should not be able to, either by it being the wrong type or being too high of a 
level requirement, then a custom InvalidWeaponException should be thrown </p>

<p> It is recommended to think about how this Weapon check is implemented. Try out some implementations and decide on 
which is best (hint, think about some OO Design here, maybe it could be in the inherited classes with a base abstract 
method to be more extendable). You can use unit testing to see if your refactors break the functionality. </p>

## 3. Armor 

<p> There are several types of Armor that exist: </p>
<ul>
  <li>Cloth</li>
  <li>Leather</li>
  <li>Mail</li>
  <li>Plate</li>
</ul>
<p> As with Weapons, it is recommended to store this type as property. </p>
<p> Armor has attributes that add to the character’s power. These attributes are the same as the primary attributes and this 
means the PrimaryAttribute custom type can be reused. </p>
<p> Like Weapons, Armor is restricted to certain character classes. This is shown below: </p>

<ul>
  <li> Mages – Cloth</li>
  <li>Rangers – Leather, Mail</li>
  <li>Rogues – Leather, Mail</li>
  <li>Warriors – Mail, Plate</li>
</ul>

<p> If a character tries to equip armor they should not be able to, either by it being the wrong type or being too high of a 
level requirement, then a custom InvalidArmorException should be thrown. </p>
<p> Like with weapons, it is recommended to try different implementations of the Armor check and settle on one that is the 
best designed, according to you.
</p>

## 4. Equipment
<p>A character can equip any item. An equipped item is stored in the character’s equipment and is used to increase the 
characters power. </p>
<p>Items can be equipped in one of several slots:</p>
<ul>
  <li>Head</li>
  <li>Body</li>
  <li>Legs</li>
  <li>Weapon</li>
</ul>

<p>Armor can be equipped in any non-weapon slot, and weapons can only be equipped in a weapon slot. You can create 
Slot as an enumerator.
</p>

<div>
NOTE: You do not have to add a check to see if a weapon has its slot as Weapon, you can assume data will be created 
properly. Testing data is provided to you to use
</div>

<p>It is recommended to store the equipment as a HashMap<Slot, Item>. This is to ensure you only ever have one item in 
each slot. You will just replace the Item that corresponds to the Slot. </p>
  
<div>
NOTE: You do not need to cater for unequipped items, they just are removed. 
</div>

## 4.1 Total attributes and calculations
<p>As mentioned before, every character has a base and total primary attribute. When the total is needed you should look 
at what armor is equipped and add all the primary attributes present in those items to the base.</p>
<ul>
  <li> Total attribute = base + attributes from all equipped armor</li>
</ul>
<p>This can then be used to determine the character’s DPS</p>
<ul>
  <li> Character DPS = Weapon DPS * (1 + TotalMainPrimaryAttribute/100)</li>
</ul>
<p> Recall, when we speak about main primary attribute here, it is the one that increases the damage for the class (Strength 
for Warriors, etc..). Hint: you can see how this will behave differently based on the character class. Consider using 
polymorphism here to aid you.</p>

<div>NOTE: If a character has no weapon equipped, take the weapon DPS to equal 1.</div>
## 5. Character stats display
<p> All characters need a way to display their statistics to a character sheet. For this example, a simple string generated by 
using a StringBuilder is a good solution. This sheet should show: </p>
<ul>
  <li>Character name</li>
  <li>Character level</li>
  <li>Strength</li>
  <li>Dexterity</li>
  <li>Intelligence</li>
  <li>DPS</li>
</ul>
<p> The attribute statistics is the total (base + gear bonus). </p>
<div>NOTE: These values change as the character levels up or equips new items.</div>
<p align="right">(<a href="#top">back to top</a>)</p>

# Appendix C: Unit testing and test coverage

## 1. Introduction and overview
<p> Unit testing is an integral part of any well-designed system. It allows us to know for certain what functionality is working 
as intended. When we speak of test coverage, it means that every public facing method is tested to ensure it outputs the 
expected values or has the desired effect. This does not mean we need to test for methods used inside the classes (the 
private methods) as those are the refactoring of the public facing methods.  </p>

<p> This appendix will detail what functionality needs to be tested and will provide some data to use. It will not be written 
tests, but simply inputs and expected outputs. It is recommended to make two test classes, one for Character tests and 
one for Item tests.  </p>

<p> When performing unit tests, there are a few things to keep in mind that have been previously discussed:
 </p>
 
 <ul>
  <li> One assert per test method (strive for this</li>
  <li>Remember AAA – arrange act assert. </li>
  <li>Be as explicit as possible, every parameter or output is stored in a variable.
o Do not invoke the method in the assert, invoke it before and save the return.
</li>
  <li>Naming is important.
o MethodYouAreTesting_ConditionsItsBeingTestedUnder_ExpectedBehaviour().
</li>
</ul>

## 2. Character attribute and level tests

<p>These tests could be done in a separate test class to the items one. This makes our codebase easier to navigate. These 
tests should cover the following behavior:</p>

<ul>
  <li>A character is level 1 when created.</li>
  <li>When a character gains a level, it should be level 2. </li>
  <li>Each character class is created with the proper default attributes.
  <li>Use level 1 stats for each character as expected.</li>
  <li> This results in four test methods</li>
  </li>
  <li>Each character class has their attributes increased when leveling up.
  <li>Create each class once, level them up once</li>
  <li> Use the base attributes, plus one instance of the level up as the expected.    </li>
  <li>E.g. Warrior -> levelup() -> ( Strength = 8, Dexterity = 4, Intelligence = 2) expected.</li>
  <li>This results in four test methods.
  </li>
  </li>
</ul>

<div>NOTE: Every class needs to be tested that they gain stats correctly</div>

## 3.Items and equipment tests
<p>The items and equipment tests use a Warrior class for testing, an axe for an example weapon and plate body armor as 
an example armor. We also use a bow for a wrong weapon type, and cloth head armor for wrong armor type.</p>

<p>Keep in mind, because this functionality is shared between all classes and items, just testing these minimal examples 
covers all the code. You do not need to create one of every item type and character. This is because we are testing 
behaviors not implementations. We are answering the question “Can a character equip a weapon and armor as 
expected?”. If this is unclear to you, go back to the provided resources in the lectures and read about “writing minimally 
passing tests”.</p>

<p>Another thing to keep in mind, the test data will expose one possible solutions data structure for these items. You do 
not need to follow it exactly for naming and composition, but the main aspects need to be captured to fulfill the 
functional requirements. </p>

<p>Example weapon used for testing – you do not need to use this exact structure; the items are just an example used to 
explain the tests:</p>

<div>NOTE: These should not be globally declared and reused, they should be redeclared in each test method (best practices).</div>

<p>Feel free to change the item names or use different items or character classes for the tests. As long as they fulfill the 
testing requirements.</p>

<p>The item and equipment tests should cover the following behaviors:</p>
### 1. If a character tries to equip a high level weapon, InvalidWeaponException should be thrown.
<ul>
  <li>Use the warrior, and the axe, but set the axes level to 2.</li>
</ul>
### 2. If a character tries to equip a high level armor piece, InvalidArmorException should be thrown.
<ul>
  <li>Use the warrior, and the plate body armor, but set the armor’s level to 2.
</li>
</ul>
### 3. If a character tries to equip the wrong weapon type, InvalidWeaponException should be thrown.
<ul>
  <li>Use the warrior and the bow.</li>
</ul>
### 4. if a character tries to equip the wrong armor type, InvalidArmorException should be thrown.
<ul>
  <li>Use the warrior and the cloth armor.</li>
</ul>
### 5. If a character equips a valid weapon, a Boolean true should be returned.
### 6. if a character equips a valid armor piece, a Boolean true should be returned.
### 7. Calculate DPS if no weapon is equipped.
<ul>
  <li>Take warrior at level 1</li>
  <li>Expected DPS = 1*(1 + (5 / 100))</li>
</ul>
### 8. Calculate DPS with valid weapon equipped.
<ul>
  <li>Take warrior level 1</li>
  <li> Equip axe.</li>
  <li>Expected DPS = (7 * 1.1)*(1 + (5 / 100))</li>
</ul>
### 9. Calculate DPS with valid weapon and armor equipped.
<ul>
  <li>Take warrior level 1.</li>
  <li>Equip axe.</li>
  <li>Equip plate body armor.</li>
  <li>Expected DPS = (7 * 1.1) * (1 + ((5+1) / 100))</li>
</ul>

<p>We could add tests before the DPS tests to see if the total primary attribute is being added properly, but to save some 
time we went straight to DPS. Ideally you wouldn’t do this skip.</p>



<p align="right">(<a href="#top">back to top</a>)</p>

# Resources

Code: <a href="/src">Source</a>

# Install

```
cd RPG_Characters
```

# Usage

```
Run
```

<p align="right">(<a href="#top">back to top</a>)</p>

# Maintainers

[@OmarAbdiAli](https://github.com/OmarAbdiAli)

# Contributing

[@OmarAbdiAli](https://github.com/OmarAbdiAli)

<p align="right">(<a href="#top">back to top</a>)</p>

# Conventions

`fix: <description>` a commit of the type fix patches a bug in your codebase (this correlates with `PATCH` in Semantic Versioning).<br/>
`feat: <description>` a commit of the type feat introduces a new feature to the codebase (this correlates with `MINOR` in Semantic Versioning).<br/>
`BREAKING CHANGE: <description>` a commit that has a footer `BREAKING CHANGE:`, or appends a ! after the type/scope, introduces a breaking API change (correlating with `MAJOR` in Semantic Versioning). A `BREAKING CHANGE` can be part of commits of any type.

Read more: [Conventional Commits](https://www.conventionalcommits.org/en/v1.0.0/) v1.0.0

<p align="right">(<a href="#top">back to top</a>)</p>

# Contact

OmarAbdiAli: <a href="mailto:github.omarabdiali0@gmail.com">github.OmarAbdiAli@gmail.com</a>

<p align="right">(<a href="#top">back to top</a>)</p>

