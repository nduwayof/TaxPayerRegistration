/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$(document).ready(function () {
    $("#entreprisePhoneNo").keypress(function (e) {
        if (e.which != 8 && e.which != 0 && (e.which < 48 || e.which > 57)) {
            $("#entreprisePhoneNoMsg").html("Numbers Only").show().fadeOut("slow");
            return false;
        }
    });
    $("#representativePhoneNo").keypress(function (e) {
        if (e.which != 8 && e.which != 0 && (e.which < 48 || e.which > 57)) {
            $("#representativePhoneNoMsg").html("Numbers Only").show().fadeOut("slow");
            return false;
        }
    });
    $("#contactPhoneNo").keypress(function (e) {
        if (e.which != 8 && e.which != 0 && (e.which < 48 || e.which > 57)) {
            $("#contactPhoneNoMsg").html("Numbers Only").show().fadeOut("slow");
            return false;
        }
    });

    $("#foreingPhoneNo").keypress(function (e) {
        if (e.which != 8 && e.which != 0 && (e.which < 48 || e.which > 57)) {
            $("#foreingPhoneNoMsg").html("Numbers Only").show().fadeOut("slow");
            return false;
        }
    });

});