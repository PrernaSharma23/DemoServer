from fastapi import APIRouter
from service.health_service import get_health

router = APIRouter()

@router.get("/health")
def health():
    """
    Detailed health check for Server.
    No upstream dependencies for server.
    """
    return get_health()
