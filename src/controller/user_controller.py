from fastapi import APIRouter, HTTPException
from service.user_service import get_user_by_id, get_all_users
from model.user_model import User
from model.error_model import ErrorResponse
from typing import List

router = APIRouter()

@router.get("/{user_id}", response_model=User, responses={404: {"model": ErrorResponse}})
def get_user(user_id: int):
    user = get_user_by_id(user_id)
    if not user:
        raise HTTPException(status_code=404, detail="User not found")
    return user

@router.get("/", response_model=List[User])
def get_users():
    return get_all_users()
