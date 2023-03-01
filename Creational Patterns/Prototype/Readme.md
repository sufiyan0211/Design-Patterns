Prototype Design Pattern
===

<p>
<ol>
    <li>This is basically used to create the clone of object.</li>
    <li>Why we need to clone: because initializing the object again and again will cost time & memory which is not efficient for the code.</li>
    <li>That's why we clone the object instead of initializing it.</li>
    <li>Cloning the object is achieved by implementing Clonable interface (Marker class).</li>
    <li>Marker class creates the shallow copy. so cloning will also do shallow copying of object.</li>
</ol>

</p>
