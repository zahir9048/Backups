<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class userController extends Controller
{
    function show($id){
        return "hello $id, i am controller";
    }

    function print($data){
        echo "hey $data from print func";
    }

    function loadView($userData){
        return view('docs',['uData'=>$userData]);
    }

    function loadView2(){
        return view('docs',['users'=>['zahir','asim','rayan']]);
    }
}
