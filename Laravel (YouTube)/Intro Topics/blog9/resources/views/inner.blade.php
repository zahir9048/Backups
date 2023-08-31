<h1>Inner Page</h1>

{{--@foreach ($users as $user)
    <h3>{{$user}}</h3>
@endforeach --}}

<script>
    var data = @json($uData);
    console.log(data);
</script>