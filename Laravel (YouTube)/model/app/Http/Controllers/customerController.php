<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Models\customer;

class customerController extends Controller
{
    //
    function getData(){
        return customer::all();
    }
}
