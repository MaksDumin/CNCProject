<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
    <script src="https://unpkg.com/axios/dist/axios.min.js"></script>
    <title>Document</title>
</head>
<body>
<#--<h1>Цех №3 Механический</h1>
<h4>Рабочие центры</h4>
<form action="/" method="get">
    Поиск по названию Рабочего центра: <input type="text" name="center"> <br>
    <input type="submit" value="Поиск">
</form>-->
<#list machines as WorkCenter>
    <div>
        <p><b>${WorkCenter.center}</b>&nbsp${WorkCenter.error} &nbsp | <a href="/WorkCenter/${WorkCenter.id}"> Перейти...</a></p>

    </div>
    <#else>
    <h3> Список пуст </h3>
</#list>
<hr>
<h3>Добавить событие</h3>
<hr>
<form id="myform" action="/WorkCenter/create" method="post">
    Рабочий центр <input id="cnt" type="text" name="center"/><br><br>
    Событие <input id="err" type="text" name="error"/><br><br>
    Дата/время <input id="dt" type="text" name="data"/><br><br>
    <input type="submit" value="Добавить событие"/>
<script>
    const url_string = window.location.href;
    const url = new URL(url_string);
    const a = url.searchParams.get("a");
    const b = url.searchParams.get("b");
    const arr1 = {
        '1' : 'Станок 1',
        '2' : 'Станок 2',
        '3' : 'Станок 3',
        '4' : 'Станок 4',
        '5' : 'Станок 5',
    }
    const arr2 = {
        '1' : 'Причина 1',
        '2' : 'Причина 2',
        '3' : 'Причина 3',
        '4' : 'Причина 4',
        '5' : 'Причина 5',
    }
    window.addEventListener('load', () => {
        const stan = arr1[a];
        const eror = arr2[b];
        document.getElementById('cnt').value = stan;
        document.getElementById('err').value = eror;
        document.getElementById('dt').value = "24.05.2024";
        document.querySelector('input[type="submit"]').click();

    });
</script>
</form>
</body>
</html>