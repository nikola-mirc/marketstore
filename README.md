# Market Store


After reading specification multiple times I concluded that it would be, in my opinion, appropriate to use an abstract class for the discount card.

There are three types of discount cards that the store is using(bronze, silver, gold). The fact is that each of these cards have pretty much the same characteristics, except that only the discount rate differs depending on the type of the card (and of course the turnover).

I thought it makes sense for all the discount card subtypes to inherit the functionalities of the basic discound card, and for those which are different we simply make proper adjustments by overloading parent methods.

I'm not really sure if that upon initialization and creation of the discount card object there needs to be starting turnover (in real world it wouldn't make much sense in my opinion), but for the ease of printing information i just implemented it as such. There are many ways to expand and we can go different ways, but for the purpose of this assignment I hope it suffices.

The program is supposed to be started by running Main class.

*built using jdk11

