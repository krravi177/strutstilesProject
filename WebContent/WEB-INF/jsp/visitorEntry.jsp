<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<html>
    <head>
        <title>First Login Example Project</title>
        <script type="text/javascript">
        
        function submitSave()
        {    
        	 document.vf.action="visitormgt.do?method=saveDetail";
        	 document.vf.submit();
        }
        
        function getDist()
        {  
        var stCode=document.getElementById("stCode").value;
         document.vf.action="visitormgt.do?method=getDistList&stcode="+stCode+"";
         document.vf.submit();
        }
        </script>
        
        
      
        
        
        
        
    </head>
   <body bgcolor="cyan" >
   <h1 align ="center">
   <font size="40px" color="black">Vehicle Monitoring System</font></h1><br>
	<h2 align ="center"><font size="20px" color="red">Visitor Entry</font></h2>
	
        <html:form action="visitormgt" >
       
       
    <table border="1" align="center">
        		
       <tr><td colspan="4">
       <logic:present name="save">
       <bean:write name="save"/>
       </logic:present>
       <logic:present name="unsave">
       <bean:write name="unsave"/>
       </logic:present>
       </td></tr> 	  
        	    
        	<tr>
        			<td class="link4">State Name : </td>
        			<td>
        			
        			<html:select property="stCode" name="vf" styleId="stCode" onchange="getDist();">
        			<html:option value="0">select state</html:option>
        			<logic:present name="lst">
        			
 <html:options collection="lst" property="stCode" labelProperty="stName" />
        
        			</logic:present>
      
        
        
        </html:select></td>
        			
        			<td class="link4">District Name : </td>
        			
        			  <td>
        			<html:select property="distCode" name="vf">
        			<html:option value="0">--select District--</html:option>
        			
        			<logic:present name="dlst">
 <html:options collection="dlst" property="distCode" labelProperty="distName"></html:options>	
        			</logic:present>
        			
        			
        			
        			
        			</html:select>
        			</td>
        			
        		</tr>
        	
        		<tr>
        			<td class="link4">User Name : </td>
        			<td ><html:text name="vf" property="vName" /><br></td>
        		<td class="link4">Email  : </td>
        			<td><html:text name="vf" property="vEmail" /><br></td>
        		</tr>
        		
        		<tr>
        			<td class="link4"> Addres : </td>
        			<td ><html:text name="vf" property="vAdd" /><br></td>
        		<td class="link4">Phone  : </td>
        			<td><html:text name="vf" property="vPhone" /><br></td>
        		</tr>
        		
        		<tr>
					
				<td><html:submit property="method" value="Save" onclick="submitSave();" /></td>
				
        		</tr>
        		
        	</table>
        </html:form>
    </body>
</html>
