package homework_13.Roza_Petrosyan.notepad;

public enum LabelKey {
        HY("hy"),
        RU("ru"),
        EN("en");
        private final String label;
        LabelKey(String label){
            this.label = label;
        }

        public String getLabel() {
            return label;
        }
}
