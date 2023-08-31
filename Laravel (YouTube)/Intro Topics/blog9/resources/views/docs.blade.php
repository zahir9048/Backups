<h1>Docs Page</h1>
<p>Data = {{$uData}}</p>
<h2>{{10+34}}</h2>


@if ($uData=="zahir")
    <p>Inside if</p>
@elseif ($uData=="asim")          {{-- if else condition --}}
    <p>Inside else if</p>
@else
    <p>Inside else</p>
@endif 

{{--@for ($i=0; $i<5; $i++)            //for loop 
    <h4>{{$i}}</h4>
@endfor
--}}

{{--
@foreach ($users as $user)             //foreach loop 
    <h3>{{$user}}</h3>
@endforeach
--}}

 @include('inner')