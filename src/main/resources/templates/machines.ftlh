<!doctype html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<form id="myform" action="/WorkCenter/create" method="post">
    <input id = "cnt" type= "hidden" name = "center"/>
    <input id = "err" type= "hidden" name = "error"/>
    <input id = "dt" type= "hidden" name = "data"/>
    <input id = "start" type="submit" value="Start">
    <input id = "stop" type="submit" value="Stop">
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
        document.getElementById('start').onclick = function myFunction () {
            var dt = new Date().toLocaleDateString();
            var tm = new Date().toLocaleTimeString();
            const stan = arr1[a];
            document.getElementById('cnt').value = stan;
            document.getElementById('err').value = "Станок запущен";
            document.getElementById('dt').value = dt + ' ' + tm;
        }
        document.getElementById('stop').onclick = function myFunction () {
            var dt = new Date().toLocaleDateString();
            var tm = new Date().toLocaleTimeString();
            const stan = arr1[a];
            document.getElementById('cnt').value = stan;
            document.getElementById('err').value = "Станок остановлен";
            document.getElementById('dt').value = dt + ' ' + tm;
        }

    </script>
</form>
</body>
</html>