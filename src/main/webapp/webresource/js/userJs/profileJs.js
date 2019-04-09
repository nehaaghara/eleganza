function submitProfile() {
    $('.error').remove();
    var errorCount = 0;


    if ($('#first_name').val() == '') {
        errorCount++;
        addErrormessage('first_name', 'Required');
    } else {
        if (!alphabaticValidate('first_name')) {
            errorCount++;
        }
    }

    if ($('#last_name').val() == '') {
        errorCount++;
        addErrormessage('last_name', 'Required');
    } else {
        if (!alphabaticValidate('last_name')) {
            errorCount++;
        }
    }

    if ($('#username').val() == '') {
        errorCount++;
        addErrormessage('username', 'Required');
    } else {
        if (!alphanumericValidate('username')) {
            errorCount++;
        }
    }

    if ($('#email_address').val() == '') {
        errorCount++;
        addErrormessage('email_address', 'Required');
    }
    if ($('#contect').val() == '') {
        errorCount++;
        addErrormessage('contect', 'Required');
    } else {
        if (!numericValidate('contect')) {
            errorCount++;
        }
    }

    if (parseInt(errorCount) > 0) {
        return false;
    } else {
        return true;
    }
}
