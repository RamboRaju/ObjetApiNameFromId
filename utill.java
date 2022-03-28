public static String getSobjectApiNameFromId(String recordId) {
    return Id.ValueOf(recordId).getSObjectType().getDescribe().getName();
}
