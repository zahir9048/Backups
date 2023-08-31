<h1>Users Login</h1>
<form action="users" method="POST">
    @csrf
    <input type="text" name="uname" placeholder="enter username">
    <br><br>
    <input type="password" name="pwd" placeholder="enter pass">
    <br><br>
    <button type="submit">Login</button>
</form>