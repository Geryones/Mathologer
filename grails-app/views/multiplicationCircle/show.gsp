<!doctype html>
<html>
<head>
    <title>Multiplication Circle</title>
    <style>
    circle, line {
        fill: white;
        stroke: rgba(255, 0, 0, .7);
        stroke-width: 3px;
    }

    label {
        display: block;
        float: left;
        width: 5em;
    }
    </style>
    <script>
        function increase(valueName) {
            var input = document.getElementById(valueName);
            input.value = parseInt(input.value) + 1;
        }

        // TODO: Add a function to decrease the value

    </script>
</head>

<body>
<form action="/multiplicationCircle/index">

    <div>
        <label for="segmentCount">Segments:</label>
        <input type="submit" value=" up " onclick="increase('segmentCount')" id="segmentCountUp">
        <input type="number" name="segmentCount" id="segmentCount" value="${circleInstance.segmentCount}">
        <input type="submit" value="down" onclick="decrease('segmentCount')" id="segmentCountDown">
    </div>

    <!-- TODO: Add an input for the table base -->

</form>
<svg width="400" height="400">
    <circle r="198" cx="200" cy="200"/>

    <g:each var = "line" in = "${circleInstance.lines}">
        <line x1 = "${line.x1}" x2 = "${line.x2}" y1 = "${line.y1}" y2 = "${line.y2}" />
    </g:each>
</svg>

</body>
</html>
