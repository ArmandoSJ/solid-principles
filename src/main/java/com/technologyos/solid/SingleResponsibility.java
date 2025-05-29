package com.technologyos.solid;

public class SingleResponsibility {
    // INCORRECTO: esta clase tiene más de una responsabilidad
    public class Report {
        private final String title;
        private final String content;

        public Report(String title, String content) {
            this.title = title;
            this.content = content;
        }

        public void printReport() {
            System.out.println("Title: " + title);
            System.out.println("Content: " + content);
        }

        public void saveToFile(String filename) {
            // guardar en disco
        }
    }

    public class Report2 {
        private final String title;
        private final String content;

        public Report2(String title, String content) {
            this.title = title;
            this.content = content;
        }

        public String getContent() {
            return "Title: " + title + "\nContent: " + content;
        }
    }

    public class ReportPrinter {
        public void print(Report2 report) {
            System.out.println(report.getContent());
        }
    }

    public class ReportSaver {
        public void save(Report2 report, String filename) {
            // save file
        }
    }
}
