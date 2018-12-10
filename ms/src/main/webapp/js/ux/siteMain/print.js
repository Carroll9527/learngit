var tableString="<html><head><link rel='stylesheet' type='text/css' href='css/table_print.css'/></head><body><table cellspacing='0'  id='PrintBody' border='1'  >";


function doPrint(){
 
         
       tableString += "<script language='javascript'>window.print();</s"+"cript>";

    

      win = document.open('','','height=1000,width=1200,scrollbars=yes,status =yes');

      win.document.write(tableString);
      tableString="<html><head><link rel='stylesheet' type='text/css' media='print' href='./css/print.css'/></head><body><table cellspacing='0'  id='PrintBody' border='1' style='font-size:12px' >";

      win.document.close();
     
     
 }


function CreateFormPage(strPrintName, printDatagrid) {

    var frozenColumns = printDatagrid.datagrid("options").frozenColumns;  // 得到frozenColumns对象

    var columns = printDatagrid.datagrid("options").columns;    // 得到columns对象

 

    // 载入title

    tableString = tableString + "\n<tr>";

    if(frozenColumns != undefined && frozenColumns != '') {

       for(var i = 1;i<frozenColumns[0].length; i++) {

           if(frozenColumns[0][i].hidden != true) {

              tableString = tableString + "\n<th width= '" +frozenColumns[0][i].width  +"'>" + frozenColumns[0][i].title + "</th>";

           }

       }

    }

    if(columns != undefined && columns != '') {

       for(var i = 1;i<columns[0].length; i++) {

           if(columns[0][i].hidden != true) {

              tableString = tableString + "\n<th width= '" +columns[0][i].width  +"'>" + columns[0][i].title + "</th>";

           }

       }

    }

    tableString = tableString + "\n</tr>";

 

    // 载入内容

    var rows = printDatagrid.datagrid("getRows"); // 这段代码是获取当前页的所有行。

    for(var j = 0; j <rows.length;j++) {

       tableString = tableString + "\n<tr>";

       if(frozenColumns != undefined && frozenColumns != '') {

           for(var i = 0;i<frozenColumns[0].length; i++) {

              if(frozenColumns[0][i].hidden != true) {

                  tableString = tableString + "\n<td >" + rows[j][frozenColumns[0][i].field] + "</td>";

              }

           }

       }

       if(columns != undefined && columns != '') {

           for(var i = 1;i<columns[0].length; i++) {

              if(columns[0][i].hidden != true) {

                  tableString = tableString + "\n<td>" + rows[j][columns[0][i].field] + "</td>";

              }
             

           }

       }

       tableString = tableString + "\n</tr>";

    }

    tableString = tableString + "\n</table></body></html>";
   

    doPrint();

}
