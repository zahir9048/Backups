<?php

namespace App\Http\Controllers;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;

class userController extends Controller
{
    //
    function index(){

        echo "Connection established";

        return DB::select("SELECT * FROM customers");
    }
}
