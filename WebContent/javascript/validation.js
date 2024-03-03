function back()
{
	window.history.back();
    return false;
}


function checkSelection(myForm,input)
{	

   		var cbox="";
   		if(input=="Driver")
   		{
			cbox = myForm.Driver;
		}
		
		if(input=="Customer")
		{
			cbox = myForm.Customer;
		}
		
		if(input=="Taxi")
		{
			cbox = myForm.Taxi;
		}		
		
		
		flag = false;
		if(cbox.length==undefined)
		{
			if(cbox.checked==true)
			{
					flag = true;
			}
		}
		else
		{		
			for(var i=0; i<cbox.length; i++)
			{
			
				if(cbox[i].checked==true)
				{
					flag = true;
					break;
				}
			}
		}
		
		if(flag==false)
		{
			alert("Please select a "+input)
			
			return false;
		}
		else
		{
			return true;
		}		
}


function sendTaxiMessage(myForm)
{
	var status = false;
	
	var text = myForm.msgTxt.value;
	
	if(text== null || text.length == 0)
	{
		alert('Please enter a proper message');
	}
	else
	{
		status = checkHtmlSelect(myForm,"availTaxi");
	}
	
	return status;
}


function checkHtmlSelect(myForm,text)
{
		var select="";
		if(text == "assignTaxi")
		{
			select = myForm.assignTaxi;
		}
		
		if(text == "availTaxi")
		{
			select = myForm.availTaxi;
		}		
	
		flag = false;
		if(select.length==undefined)
		{
			if(select.selected==true)
			{
					flag = true;
			}
		}
		else
		{		
			for(var i=0; i<select.length; i++)
			{	
				if(select[i].selected==true)
				{
					var x = select[i].value;
					if( !(x == "select" ||  x == "available" || x == "assign"))
					{
						flag = true;
						break;
					}
				}
			}
		}
		
		if(flag==false)
		{
			alert("Please select a taxi")
			
			return false;
		}
		else
		{
			return true;
		}			
	
	
	
	
	return false;
}