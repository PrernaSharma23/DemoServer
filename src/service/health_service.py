import time
from typing import Dict

START_TIME = time.time()
VERSION = "1.0.0-server"

def _uptime_seconds() -> float:
    return time.time() - START_TIME

def get_health() -> Dict:
    return {
        "service": "server",
        "status": "ok",
        "version": VERSION,
        "uptime_seconds": round(_uptime_seconds(), 2),
        "dependencies": {}
    }
