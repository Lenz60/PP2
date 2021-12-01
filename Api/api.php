<?php 
	require_once 'dbconnectapi.php';
	
	$response = array();
	
	if(isset($_GET['apicall'])){
		
		switch($_GET['apicall']){
			
			case 'loginguest' :
				if(isTheseParametersAvailable(array('tablecode','notable','guestname'))){
					$tablecode = $_POST['tablecode']; 
					$notable = $_POST['notable']; 
					$guestname = $_POST['guestname']; 

					$stmt = $conn->prepare("INSERT INTO Guest(Kode_meja,No_meja,Nama_guest) VALUES(?,?,?)");
						$stmt->bind_param("sss", $tablecode, $notable, $guestname);
						$stmt->execute();

						$stmt = $conn->prepare("SELECT Kode_meja FROM Guest WHERE Kode_meja = ?");
						$stmt->bind_param("s", $tablecode);
						$stmt->execute();
						$stmt->store_result();
						
						if($stmt->num_rows > 0){
							$response['error'] = true;
							$response['message'] = 'Duplicate Table Code';
						}
						else {
							$response['error'] = false;
							$response['message'] = 'Guest Saved Succesfully';
						}
								
				}else{
					$response['error'] = true; 
					$response['message'] = 'required parameters are not available'; 
				}
			break;			
			
			case 'order' :
				if(isTheseParametersAvailable(array('notable','tablecode','ordercode','productcode','productqty',
					'toppingcode1','toppingcode2','toppingcode3',
					'toppingcode4','toppingcode5','toppingcode6',
					'toppingcode7','toppingcode8','toppingcode9',
					'toppingcode10'))){
					//Order Code
					$ordercode = $_POST['ordercode'];
					//Guest Declaration
					$notable = $_POST['notable']; 
					$tablecode = $_POST['tablecode']; 
					//Product Declaration
					$productcode = $_POST['productcode'];
					$productqty = $_POST['productqty'];
					//Topping Declaration
					$toppingcode1 = $_POST['toppingcode1'];
					$toppingcode2 = $_POST['toppingcode2'];
					$toppingcode3 = $_POST['toppingcode3'];
					$toppingcode4 = $_POST['toppingcode4'];
					$toppingcode5 = $_POST['toppingcode5'];
					$toppingcode6 = $_POST['toppingcode6'];
					$toppingcode7 = $_POST['toppingcode7'];
					$toppingcode8 = $_POST['toppingcode8'];
					$toppingcode9 = $_POST['toppingcode9'];
					$toppingcode10 = $_POST['toppingcode10'];
					
					//Guest Query (Insert Guest Query)
					$stmt = $conn->prepare("INSERT INTO Guest_Order(Kode_Order,Kode_Meja) VALUES(?,?)");
					$stmt->bind_param("ss",$ordercode,$notable);
					$stmt->execute();

					//Product Query (Insert Product Order)
					$stmt = $conn->prepare("INSERT INTO Product_Order(Kode_Produk,Kode_Order,Jumlah_Produk_PO) VALUES(?,?,?)");
					$stmt->bind_param("sss",$productcode,$ordercode,$productqty);
					$stmt->execute();

					//Product Query (Select Product Order and store)
					$stmt = $conn->prepare("SELECT Kode_produk_order FROM Product_Order WHERE Kode_Order = ? ");
					$stmt->bind_param("s",$ordercode);
					$stmt->execute();
					$stmt->store_result();

					if($stmt->num_rows > 0){
						$stmt->bind_result($productordercode);
						$ProductOrderCode = $productordercode;

						$response['error'] = false;
						$response['message'] = 'Succesfully declared Product as local variable';
					}
					else{
						$response['error'] = true;
						$response['message'] = 'Failed declared Product as local variable';
					}

					//Query Topping (Insert Topping Order)
						//Topping 1
					if($toppingcode1 == "none"){

					}
					else {
						$stmt = $conn->prepare("INSERT INTO Topping_Order(Kode_Produk_Order,Kode_Topping) VALUES(?,?)");
						$stmt->bind_param("ss",$ProductOrderCode,$toppingcode1);
						$stmt->execute();
					}
						//Topping 2
					if($toppingcode2 == "none"){

					}
					else {
						$stmt = $conn->prepare("INSERT INTO Topping_Order(Kode_Produk_Order,Kode_Topping) VALUES(?,?)");
						$stmt->bind_param("ss",$ProductOrderCode,$toppingcode2);
						$stmt->execute();
					}
						//Topping 3
					if($toppingcode3 == "none"){

					}
					else {
						$stmt = $conn->prepare("INSERT INTO Topping_Order(Kode_Produk_Order,Kode_Topping) VALUES(?,?)");
						$stmt->bind_param("ss",$ProductOrderCode,$toppingcode3);
						$stmt->execute();
					}
						//Topping 4
					if($toppingcode4 == "none"){

					}
					else {
						$stmt = $conn->prepare("INSERT INTO Topping_Order(Kode_Produk_Order,Kode_Topping) VALUES(?,?)");
						$stmt->bind_param("ss",$ProductOrderCode,$toppingcode4);
						$stmt->execute();
					}
						//Topping 5
					if($toppingcode5 == "none"){

					}
					else {
						$stmt = $conn->prepare("INSERT INTO Topping_Order(Kode_Produk_Order,Kode_Topping) VALUES(?,?)");
						$stmt->bind_param("ss",$ProductOrderCode,$toppingcode5);
						$stmt->execute();
					}
						//Topping 6
					if($toppingcode6 == "none"){

					}
					else {
						$stmt = $conn->prepare("INSERT INTO Topping_Order(Kode_Produk_Order,Kode_Topping) VALUES(?,?)");
						$stmt->bind_param("ss",$ProductOrderCode,$toppingcode6);
						$stmt->execute();
					}
						//Topping 7
					if($toppingcode7 == "none"){

					}
					else {
						$stmt = $conn->prepare("INSERT INTO Topping_Order(Kode_Produk_Order,Kode_Topping) VALUES(?,?)");
						$stmt->bind_param("ss",$ProductOrderCode,$toppingcode7);
						$stmt->execute();
					}
						//Topping 8
					if($toppingcode8 == "none"){

					}
					else {
						$stmt = $conn->prepare("INSERT INTO Topping_Order(Kode_Produk_Order,Kode_Topping) VALUES(?,?)");
						$stmt->bind_param("ss",$ProductOrderCode,$toppingcode8);
						$stmt->execute();
					}
						//Topping 9
					if($toppingcode9 == "none"){

					}
					else {
						$stmt = $conn->prepare("INSERT INTO Topping_Order(Kode_Produk_Order,Kode_Topping) VALUES(?,?)");
						$stmt->bind_param("ss",$ProductOrderCode,$toppingcode9);
						$stmt->execute();
					}
						//Topping 10
					if($toppingcode10 == "none"){

					}
					else {
						$stmt = $conn->prepare("INSERT INTO Topping_Order(Kode_Produk_Order,Kode_Topping) VALUES(?,?)");
						$stmt->bind_param("ss",$ProductOrderCode,$toppingcode10);
						$stmt->execute();
					}
					
					//Guest Query (Set Guest Code to Local Variable)
					$stmt = $conn->prepare("SELECT Kode_Guest_Order FROM Guest_Order WHERE Kode_Order = ? ");
					$stmt->bind_param("s",$ordercode);
					$stmt->execute();
					$stmt->store_result();

					if($stmt->num_rows > 0){
						$stmt->bind_result($guestcodeorder);
						$GuestCodeOrder = $guestcodeorder;

						$response['error'] = false;
						$response['message'] = 'Succesfully declared Guest as local variable';
					}
					else{
						$response['error'] = true;
						$response['message'] = 'Failed declared Guest as local variable';
					}
					/////////////////////////////////////////////////////
						//ORDER QUERY HERE//
					////////////////////////////////////////////////////

					$stmt = $conn->prepare("INSERT INTO Orders(Kode_order,Kode_Guest_Order,Kode_Produk_Order,Status_order) VALUES(?,?,?,'Disiapkan')");
					$stmt->bind_param("sss",$ordercode,$GuestCodeOrder,$ProductOrderCode);
					$stmt->execute();
				}
				else{
					$response['error'] = true; 
					$response['message'] = 'required parameters are not available'; 
				}
			break;
			default: 
				$response['error'] = true; 
				$response['message'] = 'Invalid Operation Called';
		}
		
	}else{
		$response['error'] = true; 
		$response['message'] = 'Invalid API Call';
	}



	
	echo json_encode($response);
	
	function isTheseParametersAvailable($params){
		
		foreach($params as $param){
			if(!isset($_POST[$param])){
				return false; 
			}
		}
		return true; 
	}