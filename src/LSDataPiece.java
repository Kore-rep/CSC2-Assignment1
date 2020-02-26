public class LSDataPiece implements Comparable<LSDataPiece> {

    private String sourceLine;
    private String key;
    private String areas;

    public LSDataPiece(String line) {
        this.sourceLine = line;
        this.processLine(line);
    }

    private void processLine(String line) {
        int spaceIndex = line.indexOf(" ");
        if (spaceIndex == -1) {
            this.key = line;
        } else {
            this.key = line.substring(0, spaceIndex);
            this.areas = line.substring(spaceIndex + 1);
        }
    }


    public String getSource() {
        return this.sourceLine;
    }

    public String getKey() {
        return this.key;
    }

    public String getAreas() {
        return this.areas;
    }

    public boolean equals(Object o) {
        if (this.getClass( ) != o.getClass( ))
           return false;
        else {
           LSDataPiece otherLSDataPiece = (LSDataPiece)o;
           if (otherLSDataPiece.getKey().compareTo(this.getKey()) == 0) {
              if (otherLSDataPiece.getAreas().compareTo(this.getAreas()) == 0) {
                 return true;
              }
           }
        }
        return false;
    }

    public int compareTo(LSDataPiece other) {
        return this.getKey().compareTo(other.getKey());
    }

    public String toString() {
        return this.sourceLine;
    }

}