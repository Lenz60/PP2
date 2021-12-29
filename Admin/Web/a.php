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
    <table border="1" style="float:top;text-align: center;">
        <?php 
        include("connect.php");
        
        ?>
        <tr>
            <?php 
                
                $stmt = $conn->prepare ("SELECT COUNT(Status_order) FROM orders WHERE Status_order= 'Disiapkan'");
                $stmt->execute();
                $stmt->store_result();
                if($stmt->num_rows > 0){
                    $stmt->bind_result($colspan);
                    $stmt->fetch();
                    ?> <th  colspan=<?php print $colspan ?>>Pesanan Baru</th>
                    <?php
                }

            ?>
            
        </tr>
        <tr>
            <?php
                $stmt = $conn->prepare ("SELECT g.No_meja, p.Kategori_produk FROM orders o 
                                                                JOIN guest_order gord ON o.Kode_Guest_Order = gord.Kode_guest_order 
                                                                JOIN guest g ON gord.Kode_Meja = g.Kode_meja 
                                                                JOIN product_order po ON o.Kode_Produk_Order = po.Kode_produk_order 
                                                                JOIN product p ON po.Kode_Produk = p.Kode_produk 
                                                                JOIN topping_order tord ON po.Kode_produk_order = tord.Kode_Produk_Order 
                                                                JOIN topping t ON tord.Kode_Topping = t.Kode_topping 
                                        WHERE o.Status_order = 'Disiapkan' GROUP BY o.Kode_order");
                $stmt->execute();
                $resultIncomingOrder = $stmt->get_result();
                while ($rowIncoming = $resultIncomingOrder -> fetch_array(MYSQLI_ASSOC)){
                    ?>
                    <td class="sizetables3">
                        <form method="POST" action="a.php" class="hiddenform">
                            <input type="hidden" name="notable" value=<?php print $rowIncoming["No_meja"] ?>>
                            <button type="submit" name="notable" value=<?php print $rowIncoming["No_meja"] ?> class="link-button">
                                <?php print $rowIncoming["No_meja"] ?> 
                                <br> 
                                <?php print $rowIncoming["Kategori_produk"] ?>
                            </button>
                        </form>
                        
                    </td>
                <?php }
                ?>
            
                
            
            
        
        </tr>

    </table>
    <table border="1" style="float:left; text-align:center;">
        <!--  //| Lokasi Meja  -->
        <!-- //* If Nomor Meja is clicked then show the Select Order on the next Table -->
        <tr>
            <th colspan="5" scope="colgroup">Lokasi Meja</th>
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
                <td></td>
                <td colspan="4" style="height: 50px; font-size:30px;" bgcolor="<?php echo $table1Status ?>" >
                    <form method="POST" action="a.php" class="hiddenform">
                        <input type="hidden" name="notable" value="1">
                        <button type="submit" name="notable" value="1" class="link-button">1</button>
                    </form>
                </td>
            </tr>

            <tr>
                <td></td>
                <td class="sizetables1" bgcolor="<?php echo $table10Status ?>">
                    <form method="POST" action="a.php" class="hiddenform">
                        <input type="hidden" name="notable" value="10">
                        <button type="submit" name="notable" value="10" class="link-button">10</button>
                    </form>
                </td>
                <td class="sizetables2" rowspan="2" bgcolor="<?php echo $table9Status ?>">
                    <form method="POST" action="a.php" class="hiddenform">
                        <input type="hidden" name="notable" value="9">
                        <button type="submit" name="notable" value="9" class="link-button">9</button>
                    </form>
                </td>
                <td class="sizetables2" rowspan="2" bgcolor="<?php echo $table6Status ?>">
                    <form method="POST" action="a.php" class="hiddenform">
                        <input type="hidden" name="notable" value="6">
                        <button type="submit" name="notable" value="6" class="link-button">6</button>
                    </form>
                </td>
                <td class="sizetables1" bgcolor="<?php echo $table2Status ?>">
                    <form method="POST" action="a.php" class="hiddenform">
                        <input type="hidden" name="notable" value="2">
                        <button type="submit" name="notable" value="2" class="link-button">2</button>
                    </form>
                </td>
            
            <tr class="sizetables1">
                <td bgcolor="<?php echo $table3Status ?>" rowspan="2" class="sizetables2">
                    <form method="POST" action="a.php" class="hiddenform">
                        <input type="hidden" name="notable" value="13">
                        <button type="submit" name="notable" value="13" class="link-button">13</button>
                    </form>
                </td>
                <td bgcolor="<?php echo $table11Status ?>">
                    <form method="POST" action="a.php" class="hiddenform">
                        <input type="hidden" name="notable" value="11">
                        <button type="submit" name="notable" value="11" class="link-button">11</button>
                    </form>
                </td>
                <td bgcolor="<?php echo $table3Status ?>">
                    <form method="POST" action="a.php" class="hiddenform">
                        <input type="hidden" name="notable" value="3">
                        <button type="submit" name="notable" value="3" class="link-button">3</button>
                    </form>
                </td>
                
                
            </tr>

            <tr class="sizetables1">
                <td bgcolor="<?php echo $table12Status ?>">
                    <form method="POST" action="a.php" class="hiddenform">
                        <input type="hidden" name="notable" value="12">
                        <button type="submit" name="notable" value="12" class="link-button">12</button>
                    </form>
                </td>
                <td></td>
                <td bgcolor="<?php echo $table7Status ?>">
                    <form method="POST" action="a.php" class="hiddenform">
                        <input type="hidden" name="notable" value="7">
                        <button type="submit" name="notable" value="7" class="link-button">7</button>
                    </form>
                </td>
                <td bgcolor="<?php echo $table4Status ?>">
                    <form method="POST" action="a.php" class="hiddenform">
                        <input type="hidden" name="notable" value="4">
                        <button type="submit" name="notable" value="4" class="link-button">4</button>
                    </form>
                </td>
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
                <?php
                    include("connect.php")

                ?>
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
                    <?php 
                        

                        if ($_POST['notable'] == null){
                            ?>
                            <tr>
                                <td rowspan="<?php echo $a ?>">Meja 1</td> <!-- //? Fill with Order Data// -->
                            </tr>
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
                            <?php
                        }
                        else {
                            $stmt = $conn->prepare("SELECT g.No_meja, o.Kode_order,p.Nama_produk,p.Tipe_produk, t.Nama_topping, (p.Harga_produk*po.Jumlah_Produk_PO) + SUM(t.Harga_topping) AS 'Total Bayar', o.Status_order 
                            FROM orders o JOIN guest_order gord ON o.Kode_Guest_Order = gord.Kode_guest_order JOIN guest g ON gord.Kode_Meja = g.Kode_meja
                                                                             JOIN product_order po ON o.Kode_Produk_Order = po.Kode_produk_order
                                                                             JOIN product p ON po.Kode_Produk = p.Kode_produk
                                                                             JOIN topping_order tord ON po.Kode_produk_order = tord.Kode_Produk_Order
                                                                             JOIN topping t ON tord.Kode_Topping = t.Kode_topping
                            WHERE g.No_meja = '".$_POST['notable']."' GROUP BY o.Kode_order;");
                            $stmt->execute();
                            
                            $resultStatsOrder = $stmt->get_result();
                            while ($rowStats = $resultStatsOrder -> fetch_array(MYSQLI_ASSOC)){

                                //! Topping Fetch Array Here
                                ?>
                                    <tr>
                                        <td>Meja <?php print $rowStats["No_meja"] ?></td> <!-- //? Fill with Order Data// -->
                                        <td><?php print $rowStats["Nama_produk"] ?></td>
                                        <td><?php print $rowStats["Tipe_produk"] ?></td>
                                        <td>Topping</td> 
                                        <td>Rp <?php print $rowStats["Total Bayar"] ?></td>
                                        
                                        <?php $status = false; ?>
                                    </tr>
                                </td>
                            <?php }

                        }
                        
                        print "Notable = ".$_POST['notable']."\n";?>
                
                     
                </tr>
            </tr>
    </table>
</body>




</html>