
import logging

logger = logging.getLogger(__name__)


def test_stdout():
    logger.info("Some info message in stdout")
