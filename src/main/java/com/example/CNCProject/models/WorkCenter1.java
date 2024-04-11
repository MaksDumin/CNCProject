    package com.example.CNCProject.models;

    import lombok.Data;

    @Data
    public class WorkCenter1 {
        private String title;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }

