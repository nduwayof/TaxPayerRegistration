/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(function () {
    $('input').iCheck({
        checkboxClass: 'icheckbox_square-blue',
        radioClass: 'iradio_square-blue',
        increaseArea: '20%' // optional
    });
});
 function saveBank() {
        var formDat = [];
        formDat = $("#bankAccount").serializeArray();
        $.post("bankProcess.jsp", formDat);
        location.reload();
    }