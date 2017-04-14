$(document).ready(function(){
    $('form').submit(function(e) {
        e.preventDefault();
        data=$(this).serializeArray();
            $.ajax({
                url: "servlets/ServletPuente",
                type: "POST",
                data: data,
                success: function(resp){
                    $('#resultado').html(resp);
                }        
            });        
    });
    });