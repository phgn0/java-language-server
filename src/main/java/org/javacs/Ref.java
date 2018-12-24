package org.javacs;

import java.net.URI;

/** Reference from file:line(start,end) to a class or method */
public class Ref {
    public final URI fromFile;
    public final int startLine, startCol, endLine, endCol;
    public final String toEl;

    public Ref(URI fromFile, int startLine, int startCol, int endLine, int endCol, String toEl) {
        this.fromFile = fromFile;
        this.startLine = startLine;
        this.startCol = startCol;
        this.endLine = endLine;
        this.endCol = endCol;
        this.toEl = toEl;
    }
}