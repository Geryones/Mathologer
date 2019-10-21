package mathologer

class MultiplicationCircleController {

    static int radius = 200
    static int cx = radius
    static int cy = radius

    def index(MultiplicationCircleModel circleModel) {

        circleModel.lines = []
        for (int i = 0; i < circleModel.segmentCount; i++){
            def x1 = xValueOf(i, circleModel.segmentCount)
            def y1 = yValueOf(i, circleModel.segmentCount)
            def x2 = xValueOf(i * circleModel.tableBase, circleModel.segmentCount)
            def y2 = yValueOf(i * circleModel.tableBase, circleModel.segmentCount)
            def line = new Line(x1 : x1, x2 : x2, y1 : y1, y2 : y2)
            circleModel.lines.add(line)
        }

        render view: "show", model: [circleInstance: circleModel]
    }

    private static double arc(int segment, int segmentCount) {
        2 * Math.PI * segment / segmentCount
    }

    def xValueOf(int segment, int segmentCount) {
        return cx + Math.cos(arc(segment, segmentCount)) * radius
    }

    def yValueOf(int segment, int segmentCount) {
        return cy + Math.sin(arc(segment, segmentCount)) * radius
    }
}

class MultiplicationCircleModel {

    List<Line> lines = Collections.EMPTY_LIST
    int segmentCount = 10
    int tableBase = 2



}


class Line {
    double x1, x2, y1,y2;
}
