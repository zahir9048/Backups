<?php

namespace App\Http\Controllers;
use Illuminate\Http\Request;

class userController extends Controller
{
    //
    function getData(Request $req){
        echo "Form Submitted";
        return $req->input();
    }
}
