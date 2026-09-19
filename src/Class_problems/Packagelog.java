package Class_problems;
abstract class PackageLog {
    protected String trackingId;

    public PackageLog(String trackingId) {
        this.trackingId = trackingId;
    }

    public abstract String confirmDelivery();

    public String confirmDelivery(String signature) {
        return confirmDelivery() + ", signed by " + signature;
    }

    public static void logAll(PackageLog[] notes) {
        for (PackageLog note : notes) {
            System.out.println(note.confirmDelivery());
        }
    }
}

class ParcelNote extends PackageLog {
    public ParcelNote(String trackingId) {
        super(trackingId);
    }

    @Override
    public String confirmDelivery() {
        return "Parcel " + this.trackingId + " delivered";
    }
}

class LetterNote extends PackageLog {
    public LetterNote(String trackingId) {
        super(trackingId);
    }

    @Override
    public String confirmDelivery() {
        return "Letter " + this.trackingId + " delivered";
    }
}

