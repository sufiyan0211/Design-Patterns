Singleton Design
===
<p> 
    First understand <b><i>NonThreadedSingleton.class</i></b> 
    <ul>
        <li>Check why it does <b>not support multithreading</b>.</li>
        <li>Check how two or more or instance can be created using multithreading.</li>
    </ul>

In <b>two</b> ways we can <b>achieve multithreading</b> in singleton pattern 
<ol>
    <li><b>LazyInitialization</b> with Synchronization of method.</li>
    <li><b>EagerInitialization</b></li>
</ol>

<h3>How to break singleton object</h3>
<p>Basically there are <b>two ways</b> to do it.
<ol>
    <li>Using <b>Serialization and Deserialization</b>.</li>
    <li>Using <b>Reflection</b>.</li>
</ol>
</p>