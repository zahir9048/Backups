<?php

use Illuminate\Support\Facades\Route;

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

Route::view('/users','users');
Route::view('/home','home');
Route::view('/noaccess','noaccess');

Route::group(['middleware'=>['protected','salary']],function(){
    Route::view('/home','home');
    Route::get('/', function () {
        return view('welcome');
    });
});
