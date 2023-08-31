<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\userController;
/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| contains the "web" middleware group. Now create something great!
|
*/

Route::get('/', function () {
    return view('welcome');
});

// Route::get('/', function () {
//     return redirect('contact');                Redirect user to another page
// });

// Route::get('/{name}', function ($name) {
//     return view('welcome',['name'=>$name]);    //Passing data from url to the webpage 
// });

// Route::get('/about', function () {
//     return view('aboutus');
// });

Route::view('/about','aboutUs');       // Short hand notation
Route::view('/contact','contactUs');

Route::get('/user/{id}',[userController::class,'show']);  // Passing data from controller to the webpage
Route::get('/db/{data}',[userController::class,'print']);

Route::get('/documentation/{data}',[userController::class,'loadView']);
