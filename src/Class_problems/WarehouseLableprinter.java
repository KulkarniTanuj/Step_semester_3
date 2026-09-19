package Class_problems;



    interface Printable {
        String printLabel();
    }

    class WarehouseLableprinter implements Printable {
        private String trackingId;

        public WarehouseLableprinter(String trackingId) {
            this.trackingId = trackingId;
        }

        @Override
        public String printLabel() {
            return "Package label: " + this.trackingId;
        }
    }

    class Invoice implements Printable {
        private String invoiceNumber;

        public Invoice(String invoiceNumber) {
            this.invoiceNumber = invoiceNumber;
        }

        @Override
        public String printLabel() {
            return "Invoice label: " + this.invoiceNumber;
        }
    }



