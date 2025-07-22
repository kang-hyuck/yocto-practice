SUMMARY = "test image"

inherit kh-base-image

LINGUAS_KO_KR = "ko-kr"
LINGUAS_EN_US = "en-us"
IMAGE_LINGUAS = "${LINGUAS_KO_KR} ${LINGUAS_EN_US}"
## IMAGE_INSTALL += "packagegroup-kh"
IMAGE_OVERHEAD_FACTOR = "1.3"

inherit extrausers

EXTRA_USERS_PARAMS = "\
    groupadd khgroup; \
    useradd -p `openssl passwd 1234` kh; \
    useradd -g khgroup kh; \
"
