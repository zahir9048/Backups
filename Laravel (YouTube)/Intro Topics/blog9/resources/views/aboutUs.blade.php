<x-header componentName="About" />
<h1>About Us</h1>

<a href="{{URL::to('/')}}">Welcome Page</a> 
<a href="/">Welcome Page</a>                //two methods to inlcude URL

<p>Full URL is: {{URL::full()}} </p>
<p>Current URL is: {{URL::current()}}</p>
<p>Previous visited URL is:{{URL::previous()}}</p>
