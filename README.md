Save new Pracownik/Pracownicy via Postman (http://localhost:8081/pracownik/save):

    {
        "id": 2,
        "name": "Andrzej",
        "aktywnyPracownik": {
            "id": 2,
            "salary": 1000.00,
            "dataZatrudnienia": "1988-11-11"
        },
        "zespoly": [
            {
                "id": 3,
                "name": "IT"
            }
        ]
    }
    
Get Pracownicy: http://localhost:8081/pracownik/get

Update Pracownicy: http://localhost:8081/pracownik/update

Delete Pracownik: http://localhost:8081/pracownik/{id}

Get only aktywniPracownicy: http://localhost:8081/aktywnyPracownik/get

Get table data aktywniPracownicy: http://localhost:8081/aktywnyPracownik/activPracownikData

Save aktywniPracownicy: http://localhost:8081/aktywnyPracownik/save

Update aktywniPracownicy: http://localhost:8081/aktywnyPracownik/update

Delete aktywniPracownicy: http://localhost:8081/aktywnyPracownik/{id}
