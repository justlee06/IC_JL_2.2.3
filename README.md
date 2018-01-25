# IC_JL_2.2.3

===== README.txt ========
ATheressignment: PLTW 2.2.2
Date: (date submitted)
Team Members: Isaiah Cruz, Justin Lee, ... (include first name and last name for each member)
Description:
This assignment was a lesson in access modifiers and static variables.
Team member roles in assignment: (Who did what)
Key Lessons learned:
Summarize what you think important teaching points from the lesson were.  

The lesson showed us that we can use different access modifiers to different objects. Generally, we should use the modifier private unless there is a valid reason not to, in order to make code modification easier. We should only use the public modifier if the variable is a constant and service method, and use the protected modifier to access items only within classes. 

5) Go to the API for Java and research ArrayList. What methods do you think will be of most use to you?


The size, get, set, and iterator methods will be of most use because they will allow us to view quantitative qualities of the list and modify the list itself. For example, when we would want to use a for loop, we could use the list.size() method in a for loop to set a boundary for the number of times we would want to iterate. Using the list.set() method we could also change an individual item in a list.

27) Test your app. What do you notice? 

There were no visible effects in the app. This happened until we made changes to each of the XML files. Finally, when the changes were made, each of the family member names were shown on screen.
Conclusion Questions:


1) Summarize what each of the access modifiers do, and how they are used. (Access modifiers include “public”, “private”, and “protected”)


The Public modifier makes an object accessible everywhere, even outside its package. Once the object is made private, then it has the largest scope, similar to a global variable. This modifier may be used when you want to access the item outside of a patch of code and use it for different purposes outside of its package.

The Private modifier makes an object only available within its class. If any constructor is made private, you cannot make an instance of that class outside of that class. This ensures that when you make a change to an part of the code, you do not have to pay attention to the item that has been made public.

The Protected modifier is essentially the Private modifier, except subclasses and parent classes may have access to the item.

2) Why would you use an ArrayList instead of an array for storing the family?


You can use a ArrayList instead of an array for storing the family because you can make direct changes to the amount of items that are contained in the ArrayList, while you cannot change the capacity of any array. You can also make specific changes to each item in an ArrayList, and have each variable changed.
