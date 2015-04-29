/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$("#SignupForm").validate({
    rules :{
        homePhone:{
            required : true,
            number : true
        }
    },
    mesages :{
        homePhone : {
            number : "Invalid phone number, only use the numbers"
        }
    }
});