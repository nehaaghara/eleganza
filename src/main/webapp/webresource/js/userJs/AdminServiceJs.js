/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var service = 1;
var countLegal = 1;


function fnAddServiceRow() {
    debugger;
    service++;
    var div1 = $('<div class="row" id="dvserviceIds' + service + '" style="margin: -12px -28px;"></div>').appendTo('#dvserviceIds');
    var div2 = $('<div class="col-md-10"></div>').appendTo(div1);
    var div3 = $('<div class="form-group"></div>').appendTo(div2);
    $('<label for="serviceFK">Select Service</label>').appendTo(div3);
    var select1 = $('<select id="serviceFk' + service + '"  path="services[' + (service - 1) + ']" title="Service" name="services[' + (service - 1) + ']" class="form-control select2" onchange="DrpServiceChange(this);" style="width: 100%;"></select>').appendTo(div3);
    $(select1).append($('#serviceFk1').html());
    $(select1).val('-1');
    var div4 = $('<div class="col-md-1"></div>').appendTo(div1);
    var div5 = $('<div class="form-group"></div>').appendTo(div4);
    $('<br>').appendTo(div5);
    $('<button type="button" class="btn btn-primary" onclick="fnDeleteService(' + service + ')" style="margin:7px 0px 2px;"><i class="fa fa-close"></i></button>').appendTo(div5);
    countLegal++;

}

function fnDeleteService(service) {
    $('#dvserviceIds' + service).remove();
    service--;
    $('#service').attr("value", service);
}

function DrpServiceChange(ctrl) {
    debugger;
    var count = 0;
    var selectedVal = $(ctrl).children("option:selected").val();
    $('[id^=serviceFk]').each(function () {

        if (selectedVal == $(this).children("option:selected").val()) {
            count++;
        }
    });
    if (count > 1) {
        $(ctrl).val('-1');
        alert("Already Selected Please Select Another Value");
        $(ctrl).siblings('.form-control select2').css('border', '2px solid red');

    } else {
        $(ctrl).siblings('.form-control select2').css('border', '');
    }
}


