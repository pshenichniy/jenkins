class Common {
    static  String getOpenvinoURI(script) {
        String url = script.params.openvino_path
        new  URL(url)
        if (!(url =~ /^(?i)https?:/))
            script.error 'openvino_path:only http and https URIs alliwed'
        return url
    }
}
