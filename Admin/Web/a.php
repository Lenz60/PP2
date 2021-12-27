<!DOCTYPE html>
<html> 



<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="style.css">
    <title>Admin Pesan Palgading</title>
</head>

<body>
    <table border="1" style="float:left; text-align:center;">
        <!--  //| Lokasi Meja  -->
        <!-- //* If Nomor Meja is clicked then show the Select Order on the next Table -->
        <tr>
            <th colspan="4" scope="colgroup">Lokasi Meja</th>
        </tr>
        <tr>
            <?php 
                $table1 = "Disiapkan";
                $table2 = "Disiapkan";
                $table3 = "Disiapkan";
                $table4 = "Disiapkan";
                $table6 = "Disiapkan";
                $table7 = "Disiapkan";
                $table9 = "Disiapkan";
                $table10 = "Disiapkan";
                $table11 = "Disiapkan";
                $table12 = "Disiapkan";

                //|Table 1
                if ($table1 == "Disiapkan"){
                    $table1Status = "green";
                }
                else {
                    $table1Status = "white";
                }
                //|Table 2
                if ($table2 == "Disiapkan"){
                    $table2Status = "green";
                }
                else {
                    $table2Status = "white";
                }
                //|Table 3
                if ($table3 == "Disiapkan"){
                    $table3Status = "green";
                }
                else {
                    $table3Status = "white";
                }
                //|Table 4
                if ($table4 == "Disiapkan"){
                    $table4Status = "green";
                }
                else {
                    $table4Status = "white";
                }
                //|Table 6
                if ($table6 == "Disiapkan"){
                    $table6Status = "green";
                }
                else {
                    $table6Status = "white";
                }
                //|Table 7
                if ($table7 == "Disiapkan"){
                    $table7Status = "green";
                }
                else {
                    $table7Status = "white";
                }
                //|Table 9
                if ($table9 == "Disiapkan"){
                    $table9Status = "green";
                }
                else {
                    $table9Status = "white";
                }
                //|Table 10
                if ($table10 == "Disiapkan"){
                    $table10Status = "green";
                }
                else {
                    $table10Status = "white";
                }
                //|Table 11
                if ($table11 == "Disiapkan"){
                    $table11Status = "green";
                }
                else {
                    $table11Status = "white";
                }
                //|Table 12
                if ($table12 == "Disiapkan"){
                    $table12Status = "green";
                }
                else {
                    $table12Status = "white";
                }
                //? Continue
            
            
            ?>
            <tr>
                <td colspan="4" style="height: 50px; font-size:30px;" bgcolor="<?php echo $table1Status ?>" ><a href="#">1</a></td>
            </tr>

            <tr>
                <td class="sizetables1" bgcolor="<?php echo $table10Status ?>"><a href="#">10</a></td>
                <td class="sizetables2" rowspan="2" bgcolor="<?php echo $table9Status ?>"><a href="#">9</a></td>
                <td class="sizetables2" rowspan="2" bgcolor="<?php echo $table6Status ?>"><a href="#">6</a></td>
                <td class="sizetables1" bgcolor="<?php echo $table2Status ?>"><a href="#">2</a></td>
            </tr>

            <tr class="sizetables1">
                <td bgcolor="<?php echo $table11Status ?>"><a href="#">11</a></td>
                <td bgcolor="<?php echo $table3Status ?>"><a href="#">3</a></td>
            </tr>

            <tr class="sizetables1">
                <td bgcolor="<?php echo $table12Status ?>"><a href="#">12</a></td>
                <td></td>
                <td bgcolor="<?php echo $table7Status ?>"><a href="#">7</a></td>
                <td bgcolor="<?php echo $table4Status ?>"><a href="#">4</a></td>
            </tr>
        </tr>
    </table>
    <table border="1" style="text-align: center;">
            <?php 
            //! Query 1 HERE and Store to $OrderData
            //! Use Passed No Table from HREF POST
                //* Determine Colspan for how many topping of certain order
                $a = 3; //* Topping
                $a1 = $a+1;
                //* Check Status
                //! Get Status Value in  $OrderData
                //* if (echo $OrderData['status'] == "Disiapkan"){
                //*   $status = false; //HREF Dibuat Available
                //* }
                //* else {
                //*    $status = true; //HREF Selesai Available
                //* }
                $status = false; 
            ?>
            
            <tr>
                <th colspan="7">Status Order</th>
                <tr>
                    <th>Pesanan</th>
                    <th>Nama Makanan</th>
                    <th>Tipe Makanan</th>
                    <th>Topping</th>
                    <th>Total Bayar</th>
                    <th>Status</th>
                    <th>Konfirmasi Pesanan</th>
                </tr>

                <tr>
                    <td rowspan="<?php echo $a ?>">Meja 1</td> <!-- //? Fill with Order Data// -->
                </tr>

                <tr>
                     <!-- //? Fill with OrderCode Data// -->
                    <!-- //! Use Query 1 and use Passed No Table from Href POST-->
                    <td rowspan="<?php echo $a ?>">Nama Makanan</td>
                    <!-- //? Fill with OrderCode Data// -->
                    <!-- //! Use Query 1 and use Passed No Table from Href POST-->
                    <td rowspan="<?php echo $a ?>">Tipe Makanan</td> 
                    <!-- //? Fill with Topping Data// -->
                    <!-- //! Use Query 2 and use the stored Kode order to use the WHERE Clause// -->
                    <td>Topping1</td> 
                    <td rowspan="<?php echo $a ?>">Total Bayar</td>
                    <td rowspan="<?php echo $a ?>">Status</td>
                    <?php 
                        if ($status == true) {
                            //!Set Status to Selesai if this Clicked
                            //!Static Query Here
                            //!USE HREF POST
                            ?><td ><a href="google.com">Selesai</a></td>
                            <?php
                        }
                        else {
                            //!Set Status to Dibuat if this Clicked
                            //!Static Query Here
                            //!USE HREF POST
                            ?><td><a href="google.com">Dibuat</a></td>
                            <?php
                        }
                    ?>
                </tr>
            </tr>
    </table>
</body>




</html>