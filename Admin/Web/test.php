<?php 
include("connect.php");
$query = "SELECT g.No_meja, p.Kategori_produk
FROM orders o JOIN guest_order gord ON o.Kode_Guest_Order = gord.Kode_guest_order JOIN guest g ON gord.Kode_Meja = g.Kode_meja
                                                 JOIN product_order po ON o.Kode_Produk_Order = po.Kode_produk_order
                                                 JOIN product p ON po.Kode_Produk = p.Kode_produk
                                                 JOIN topping_order tord ON po.Kode_produk_order = tord.Kode_Produk_Order
                                                 JOIN topping t ON tord.Kode_Topping = t.Kode_topping
WHERE o.Status_order = 'Disiapkan' GROUP BY o.Kode_order;";
$hasil = mysqli_query($conn,$query) or exit("Query error at <b>".$query."</b>");
?>
<?php
            while ($dataIncomingOrder = msqli_fetch_assoc($hasil)) {?>
            <td><?php echo $dataIncomingOrder['No_meja']?></td>
        
        
        <?php    
        }
        ?>


