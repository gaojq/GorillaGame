
# GorillaGame
There are some objects that need to be defined
Because grilla, banana, and building all has its' own starting position, height, width so I build up an abstract class which cantains position and size information which later on can be inherite

### Object class
This class is an abstract class which contains
protected  int  x  ;
protected  int  y  ;
protected  int width;
protected  int height;
Those are the common subject that others might use

### Grilla class
This class extends the Object class, so that it can access the cordination and size.
In the Grilla class currently I'm overriding variables which are cordinations x, and y. Also I create new functions getLife() and moveTo(), which will be used for counting life and adjust movement of the grilla

### Weather Inteface
I made this a inteface is because the banana that grilla throw out will extends Object class, also, the weather will affect its' speed, so it need to implement another dimension need to be inherite. That is why the necessity of weather interface cannot be ignore

### Banana class
Need to extend the object class and implement the weather interface, because the banana will be affectted by those two main characters

### Building class
So far I choose to extend this class from the object class, because I think if the buildings are moving, this can be easier to manipulate. However, if the buildings are steady then things may change? Haven't decided yet

Github_Link: https://github.com/gaojq/GorillaGame