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
                $table1 = "Menunggu";
                if ($table1 == "Menunggu"){
                    $table1Status = "green";
                }
                else if ($table1 == "Disiapkan"){
                    $table1Status = "yellow";
                }
                else {
                    $table1Status = "red";
                }
                //? Continue
            
            
            ?>
            <tr>
                <td colspan="4" style="height: 50px; font-size:30px;" bgcolor="<?php echo $table1Status ?>" ><a href="google.com">1</a></td>
            </tr>

            <tr>
                <td style="width: 100px;height: 70px;font-size:30px;">10</td>
                <td style="width: 100px;height: 150px;font-size:30px;" rowspan="2">9</td>
                <td style="width: 100px;height: 150px;font-size:30px;" rowspan="2">6</td>
                <td style="width: 100px;height: 70px;font-size:30px;">2</td>
            </tr>

            <tr style="width: 100px;height: 70px;font-size:30px;">
                <td>11</td>
                <td>3</td>
            </tr>

            <tr style="width: 100px;height: 70px;font-size:30px;">
                <td>12</td>
                <td></td>
                <td>7</td>
                <td>4</td>
            </tr>
        </tr>
    </table>
    <table border="1" style="text-align: center;">
            <?php 
                //! Determine Colspan for how many topping of certain order
                $a = 3; 
                $a1 = $a+1;
                $status = true;
            ?>
            
            <tr>
                <th colspan="5">Status Order</th>
                <tr>
                    <th>Pesanan</th>
                    <th>Kode Order</th>
                    <th>Topping</th>
                    <th>Status</th>
                    <th>Konfirmasi Pesanan</th>
                </tr>

                <tr>
                    <td rowspan="<?php echo $a ?>">Meja 1</td> <!-- //? Fill with Order Data// -->
                </tr>

                <tr>
                    <td>Kode Order</td> <!-- //? Fill with OrderCode Data// -->
                    <td>Topping1</td> <!-- //? Fill with Topping Data// -->
                    <td rowspan="<?php echo $a ?>">Status</td>
                    <?php 
                        if ($status == true) {
                            //!Set Status to Selesai if this Clicked
                            //!Static Query Here
                            ?><td ><a href="google.com">Selesai</a></td>
                            <?php
                        }
                        else {
                            //!Set Status to Dibuat if this Clicked
                            //!Static Query Here
                            ?><td><a href="google.com">Dibuat</a></td>
                            <?php
                        }
                    ?>
                </tr>
            </tr>
    </table>
</body>




</html>