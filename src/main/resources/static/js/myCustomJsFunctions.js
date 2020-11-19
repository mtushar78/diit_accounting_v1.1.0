

var programJsonCommon = [];
var departmentsJsonCommon = [];
var appraisalHeadsJsonCommon = [];
var cgpaSchemeCommon = [];
/*
//Getting All Programs from database
$.post("/institutes/getAllPrograms",function(data){		
	//alert(JSON.stringify(data));
	for ( var key in data) { 
		
		var element = {id:[],programName:[],semesters:[],durationMonths:[]};			
		element["id"]  = data[key].id;
		element["programName"]  = data[key].programName;
		element["semesters"] = data[key].semesters;
		element["durationMonths"]  = data[key].durationMonths;
		
		programJsonCommon.push(element);
	}		
});	 // End Post method program list


//Function returning all program json list
function funGetAllProgramListCommon(){
	return programJsonCommon;
	
} //End funGetAppEmployeeListCommon() 

*/

//Function for generating year dropdown
function funGetYearDropDown(comboId, yearRange){
	var date = new Date();
	var curYear = date.getFullYear();
	var htmlCode = '<select class="form-control" id="' + comboId + '" name="' + comboId + '">';
	var optionBellow = '';
	var optionUp = '';
	
	for(var i = 1; i <= yearRange; i++){
		optionUp += '<option value="' + (curYear + i) + '">' + (curYear + i) + '</option>';
	}
	
	for(var i = yearRange; i >= 1; i--){
		
		optionBellow += '<option value="' + (curYear - i) + '">' + (curYear - i) +  '</option>';
	}
	
	htmlCode += optionBellow + '<option value="' + curYear + '" selected>' + curYear + '</option>' + optionUp + '</select>'; 
	
	return htmlCode;
	
} // End funGetYearDropDown() 


//Function for getting program name from json array
function funGetProgramNameFromJson(vProgramId){
	
	var programName = '';
	
	$.each(programJsonCommon, function(i, v) {
	    if (v.id == vProgramId) {
	  
	    	programName = v.programName;
	        
	    	return;
	    } 
	});
	
	//alert(empName);
	
	return programName;
} // End funGetEmployeeNameFromJson()


function funGetMonthName(vMonthNo){
	
	if(vMonthNo == '01' || vMonthNo == 1){
		return 'January';
	} else if(vMonthNo == '02' || vMonthNo == 1){
		return 'February';
	} else if(vMonthNo == '03' || vMonthNo == 2){
		return 'March';
	} else if(vMonthNo == '04' || vMonthNo == 3){
		return 'April';
	} else if(vMonthNo == '05' || vMonthNo == 4){
		return 'May';
	} else if(vMonthNo == '06' || vMonthNo == 5){
		return 'June';
	} else if(vMonthNo == '07' || vMonthNo == 6){
		return 'July';
	} else if(vMonthNo == '08' || vMonthNo == 7){
		return 'August';
	} else if(vMonthNo == '09' || vMonthNo == 8){
		return 'September';
	} else if(vMonthNo == '10' || vMonthNo == 9){
		return 'October';
	} else if(vMonthNo == '11' || vMonthNo == 10){
		return 'November';
	} else if(vMonthNo == '12' || vMonthNo == 11){
		return 'December';
	}
}

/*
//Function for getting employee name,designation,department from json array
function funGetEmpNameDesigDept(vEmoCode){
	
	var empName = '';
	
	$.each(employeeJsonCommon, function(i, v) {
	    if (v.empCode == vEmoCode) {
	  
	    	empName = v.empName + ', ' + v.empDesig + ', ' +  v.empDept;
	        
	    	return;
	    } 
	});
		
	return empName;
} // End funGetEmployeeNameFromJson()

*/
/*

	$.post("/institutes/getallcgpascheme",function(data){
		
		for(var key in data){
			
			var element = {id:[],lowestValue:[],hieghtValue:[]};			
			element["id"]  = data[key].id;
			element["lowestValue"]  = data[key].lowestValue;
			element["hieghtValue"] = data[key].hieghtValue;
						
			cgpaSchemeCommon.push(element);
		}		
		
	});
	
	function funGetCgpaSchemeCommon(){	
		return cgpaSchemeCommon;
	} */





/* Function for current date */
function funCurDate(){
	var m_names = new Array("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");
	var month= new Array("01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12");
	var d = new Date();
	var curr_date = d.getDate();
	//alert(("0" + curr_date).slice(-2));
	var curr_month = d.getMonth();
	var curr_year = d.getFullYear();
	var date = curr_year + "-" + month[curr_month] + "-" + ("0" + curr_date).slice(-2);
	return date;
	//alert(curr_date + "-" + curr_month + "-" + curr_year);
}




/*Function for getting maximum value of a json array */
function getMax(arr, prop) {
    var max;
    for (var i=0 ; i<arr.length ; i++) {
        if (!max || parseInt(arr[i][prop]) > parseInt(max[prop]))
            max = arr[i];
    }
    return max;
}
