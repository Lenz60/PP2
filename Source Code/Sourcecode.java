//////////////////////
lat1 = -7.7283180;
lat2 = -7.7283163;
lat3 = -7.7283145;
lat4 = -7.7283115;
lat5 = -7.7283070;

long1 = 110.4109377;
long2 = 110.4109390;
long3 = 110.4109416; 
long4 = 110.4109444;
long5 = 110.4109471;
long6 = 110.4109526;
//////////////////////


poslong1 = false;
poslong2 = false;
poslong3 = false;
poslong4 = false;
poslong5 = false;
poslong6 = false;
poslat1 = false;
poslat2 = false;
poslat3 = false;
poslat4 = false;
poslat5 = false;
posk1confirm = false;
posk2confirm = false;
posk3confirm = false;
posk4confirm = false;
posk6confirm = false;
posk7confirm = false;
posk9confirm = false;
posk10confirm = false;
posk11confirm = false;
posk12confirm = false;
posk13confirm = false;

///kursi
///// kursi 1 2 3 4  ////
if (longitude > long1 && longitude < long2){
    if (latitude > lat1 && latitude < lat2){
        posk1confirm = true;
        poslat1 = true;
    }
    else if (latitude > lat2 && latitude < lat3){
        posk2confirm = true;
        poslat3 = true;
    }
    else if (latitude > lat3 && latitude < lat4){
        posk3confirm = true;
        poslat4 = true;
    }
    else if (latitude > lat4 && latitude < lat5){
        posk4confirm = true;
        poslat5 = true;
    }
    else {
        posk2confirm = false;
        posk3confirm = false;
        posk4confirm = false;
        poslat3 = false;
        poslat4 = false;
        poslat5 = false;
    }
    poslong2 = true;
}
///// kursi 1 6 7 ////
else if (longitude > long2 && longitude < lon
    if (latitude > lat1 && latitude < lat2){
        posk1confirm = true;
        poslat1 = true;
    }
    else if (latitude > lat3 && latitude < lat4){
        posk6confirm = true;
        poslat4 = true;
    }
    else if (latitude > lat4 && latitude < lat5) {
        posk7confirm = true;
        poslat5 = true;
    }
    else {
        posk6confirm = false;
        posk7confirm = false;
        poslat4 = false;
        poslat5 = false;
    }
    poslong3 = true;
}
//// kursi 1 9 ///
else if (longitude > long3 && longitude < l
    if (latitude > lat1 && latitude < lat2){
        posk1confirm = true;
        poslat1 = true;
    }
    else if (latitude > lat3 && latitude < lat4){
        posk9confirm = true;
        poslat4 = true;
    }
    else{
        posk9confirm = false;
        poslat4 = false;
    }
    poslong4 = true;
}
//// kursi 1 10 11 12 //
else if (longitude > long4 && longitude < l
    if (latitude > lat1 && latitude < lat2){
        posk1confirm = true;
        poslat1 = true;
    }
    else if (latitude > lat2 && latitude < lat3){
        posk10confirm = true;
        poslat3 = true;
    }
    else if (latitude > lat3 && latitude < lat4){
        posk11confirm = true;
        poslat4 = true;
    }
    else if (latitude > lat4 && latitude < lat5){
        posk12confirm = true;
        poslat5 = true;
    }
    else {
        posk10confirm = false;
        posk11confirm = false;
        posk12confirm = false;
        poslat3 = false;
        poslat4 = false;
        poslat5 = false;
    }
    poslong5 = true;
}
// Kursi 13 //
else if (longitude > long5 && longitude < long6){
    if (latitude > lat4 && latitude < lat5){
        posk13confirm = true;
        poslat5 = true;
    }
}
else {
    poslong1 = false;
    poslong2 = false;
    poslong3 = false;
    poslong4 = false;
    poslong5 = false;
    poslong6 = false;
    poslat1 = false;
    poslat2 = false;
    poslat3 = false;
    poslat4 = false;
    poslat5 = false;
    posk1confirm = false;
    posk2confirm = false;
    posk3confirm = false;
    posk4confirm = false;
    posk6confirm = false;
    posk7confirm = false;
    posk9confirm = false;
    posk10confirm = false;
    posk11confirm = false;
    posk12confirm = false;
    posk13confirm = false;
}

if (posk1confirm)
{
    TvLokasiMeja.setText("1");
}
else if (posk2confirm)
{
    TvLokasiMeja.setText("2");
}
else if (posk3confirm)
{
    TvLokasiMeja.setText("3");
}
else if (posk4confirm)
{
    TvLokasiMeja.setText("4");
}
else if (posk6confirm)
{
    TvLokasiMeja.setText("6");
}
else if (posk7confirm)
{
    TvLokasiMeja.setText("7");
}
else if (posk9confirm)
{
    TvLokasiMeja.setText("9");
}
else if (posk10confirm)
{
    TvLokasiMeja.setText("10");
}
else if (posk11confirm)
{
    TvLokasiMeja.setText("11");
}
else if (posk12confirm)
{
    TvLokasiMeja.setText("12");
}
else if (posk13confirm){
    TvLokasiMeja.setText("13");
}
else
{
    TvLokasiMeja.setText("Deteksi Gagal");
    TvLokasiMeja.setTextColor(Color.RED);
}