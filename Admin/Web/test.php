<?php 
$table = array("2", "2","2", "9");

if (stripos(json_encode($table),'1') !==FALSE){
    $table1Status = 'green'; 
}
else {
    $table1Status = "white";
}
if (stripos(json_encode($table),'2') !==FALSE){
    $table2Status = 'green'; 
}
else {
    $table2Status = "white";
}

if (stripos(json_encode($table),'9') !==FALSE){
    $table3Status = 'green'; 
}
else {
    $table3Status = "white";
}






echo $table1Status; 
echo $table2Status;
echo $table3Status;



?>


