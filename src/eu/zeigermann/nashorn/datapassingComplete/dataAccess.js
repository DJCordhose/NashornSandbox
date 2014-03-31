var PassingData = Java.type('eu.zeigermann.nashorn.datapassingComplete.PassingData');

function dataAccess (value) {
    print("Old value from Nashorn: " + PassingData.value);
    PassingData.value = value;
    print("New value from Nashorn: " + PassingData.value);
}

function storeGlobalValue () {
    print("Old value from Nashorn: " + PassingData.value);
    PassingData.value = globalNewValue;
    print("New value from Nashorn: " + PassingData.value);
}
